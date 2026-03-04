import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();

        int casos = Integer.parseInt(in.readLine().trim());

        for (int t = 0; t < casos; t++){
            StringTokenizer st = new StringTokenizer(in.readLine(), " ");
            
            int n = Integer.parseInt(st.nextToken());
            int[] nums = new int[n];

            for (int i = 0; i < n; i++){
                nums[i] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(nums);

            int first1 = nums[n-1];
            int last1 = nums[0];

            int first2 = nums[0];
            int last2 = nums[n-1];

            int sum = abs(first1-last1);
            int sum2 = abs(first2-last2);

            int a = 1;
            int b = n-2;

            boolean mudar = true;

            while(a < b){
                int maior = nums[a++];
                int menor = nums[b--];

                if(mudar) {
                    //maior - menor -> menor - maior
                    sum += abs(maior - first1) + abs(menor - last1);
                    first1 = maior;
                    last1 = menor;

                    //menor - maior -> maior - menor
                    sum2 += abs(menor - first2) + abs(maior - last2);
                    first2 = menor;
                    last2 = maior;
                } else {
                    //menor - maior -> maior - menor
                    sum += abs(menor - first1) + abs(maior - last1);
                    first1 = menor;
                    last1 = maior;

                    //maior - menor -> menor - maior
                    sum2 += abs(maior - first2) + abs(menor - last2);
                    first2 = maior;
                    last2 = menor;
                }

                mudar = !mudar;
            }

            if(a == b){
                int num = nums[a];
                
                int d1 = abs(num-first1);
                int d2 = abs(num-last1);

                if(d1 > d2){
                    sum += d1;
                } else {
                    sum += d2;
                }

                int d3 = abs(num-first2);
                int d4 = abs(num-last2);

                if(d3 > d4){
                    sum2 += d3;
                } else {
                    sum2 += d4;
                }
            }

            int res = (sum > sum2) ? sum : sum2;
            
            sb.append("Case ")
            .append(t+1).append(": ")
            .append(res).append("\n");
        }

        System.out.print(sb);
        in.close();
    }

    public static int abs(int v) {
        return (v >= 0) ? v : -v;
    }
}