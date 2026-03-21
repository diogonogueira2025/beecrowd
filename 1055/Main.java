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

            //forma1: maior-menor
            int first1 = nums[n-1]; //maior
            int last1 = nums[0]; //menor

            //forma2: maior-menor
            int first2 = nums[0]; //menor
            int last2 = nums[n-1]; //maior

            int sum = abs(first1-last1); //soma para forma1
            int sum2 = abs(first2-last2); //soma para forma2

            int a = 1; //índice começa por 1, pois já tratei o primeiro caso
            int b = n-2; //n é o tamanho, por isso precisa ser n-2

            boolean mudar = true; //vai mudar, por exemplo, de maior-menor -> menor-maior

            while(a < b){
                int menor = nums[a++]; //pegando o menor valor
                int maior = nums[b--]; 

                if(mudar) {
                    //forma1: maior-menor
                    sum += abs(menor - first1) + abs(maior - last1);
                    first1 = menor;
                    last1 = maior;

                    //forma2
                    sum2 += abs(maior - first2) + abs(menor - last2);
                    first2 = maior;
                    last2 = menor;
                } else {
                    //forma1
                    sum += abs(maior - first1) + abs(menor - last1);
                    first1 = maior;
                    last1 = menor;

                    //forma2
                    sum2 += abs(menor - first2) + abs(maior - last2);
                    first2 = menor;
                    last2 = maior;
                }

                mudar = !mudar;
            }

            if(a == b){
                int num = nums[a];
                
                //forma1
                int s1 = abs(num-first1); //verificando soma com o primeiro elemento
                int s2 = abs(num-last1); //verificando soma com o último elemento

                if(s1 > s2){
                    sum += s1;
                } else {
                    sum += s2;
                }

                //forma2
                int s3 = abs(num-first2);
                int s4 = abs(num-last2);

                if(s3 > s4){
                    sum2 += s3;
                } else {
                    sum2 += s4;
                }
            }

            //verificando qual soma das formas é a maior
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