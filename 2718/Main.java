import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(
          new InputStreamReader(System.in)
        );

        StringBuilder sb = new StringBuilder();

        int casos = Integer.parseInt(in.readLine());

        for(int i = 0; i < casos; i++){
          char[] bin = Long.toBinaryString(Long.parseLong(in.readLine())).toCharArray(); 

          int maior = 0;
          int sum = 0;

          for(char c : bin){
            if(c == '0'){
              if(sum > maior){
                maior = sum;
              }
              sum = 0;
              continue;
            }

            sum++;
          }

          if(sum > maior) maior = sum;

          sb.append(maior).append("\n");
        }        

        System.out.print(sb);
        in.close();
    }
}
