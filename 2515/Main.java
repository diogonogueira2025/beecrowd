import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(
          new InputStreamReader(System.in)
        );

        StringBuilder sb = new StringBuilder();

        String linha;

        while ((linha = in.readLine()) != null) {
            int n = Integer.parseInt(linha);
            int[] nums = new int[n];

            StringTokenizer st = new StringTokenizer(in.readLine(), " ");

            for (int i = 0; i < n; i++) {
                nums[i] = Integer.parseInt(st.nextToken());
            }

            int left = 0;
            int right = n-1;

            int countLeft = nums[left];
            int countRight = nums[right];

            while (left < right - 1) {
                if (countLeft > countRight) {
                    countRight += nums[--right];
                } else {
                    countLeft += nums[++left];
                }
            }

            if(countLeft > countRight) {
                sb.append(countRight)
                .append(" ").append(countLeft);
            } else {
                sb.append(countLeft)
                .append(" ").append(countRight);
            }

            sb.append("\n");
        }

        System.out.print(sb);
        in.close();
    }
}