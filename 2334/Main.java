import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(
          new InputStreamReader(System.in)
        );

        StringBuilder sb = new StringBuilder();

        String linha = in.readLine();

        while (!linha.equals("-1")) {
            if(linha.equals("0")){
                sb.append("0");
            } else if(linha.length() < 19){
                sb.append(Long.parseLong(linha)-1);
            } else {
                char[] nums = linha.toCharArray();
                int index = 0;
                int tam = nums.length;

                for (int i = tam - 1; i >= 0; i--) {
                    char n = nums[i];

                    if(n != '0') {
                        nums[i]--;
                        break;
                    }

                    nums[i] = '9';
                }

                boolean achei = false;

                for (int i = 0; i < tam; i++) {
                    if (achei) {
                        sb.append(nums[i]);
                    } else if (nums[i] != '0') {
                        achei = true;
                        sb.append(nums[i]);
                    }
                }
            }

            sb.append("\n");

            linha = in.readLine();
        }

        System.out.print(sb);
        in.close();
    }
}