import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(
          new InputStreamReader(System.in)
        );

        StringBuilder sb = new StringBuilder();

        double sum = 0.0;

        int count = 0;

        

        while(count < 2){
            String linha = in.readLine();

            double num = Double.parseDouble(linha);

            if(num < 0.0 || num > 10.0) sb.append("nota invalida\n");
            else {
                sum += num;
                count++;
            }
        }

        System.out.print(sb);
        System.out.printf("media = %.2f%n", sum/2.0);
        in.close();
    }
}