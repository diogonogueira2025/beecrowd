import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(
          new InputStreamReader(System.in)
        );

        StringBuilder sb = new StringBuilder();

        String linha;
        int caso = 1;

        while ((linha = in.readLine()) != null) {

            int num = Integer.parseInt(linha);

            int count = 1;

            StringBuilder sb2 = new StringBuilder();

            sb2.append("0 ");

            for (int i = 1; i <= num; i++) {
                sb2.append(String.valueOf(i + " ").repeat(i));
                count += i;
            }

            sb2.setLength(sb2.length() - 1);
            
            sb.append("Caso ").append(caso).append(": ")
            .append(count).append((count > 1) ? " numeros" : " numero")
            .append("\n");
            sb.append(sb2).append("\n\n");

            caso++;
        }

        System.out.print(sb);
        in.close();
    }
}