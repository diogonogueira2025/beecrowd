import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(
          new InputStreamReader(System.in)
        );

        StringBuilder sb = new StringBuilder();

        String[] linha = in.readLine().split(" ");

        while(!linha[0].equals("0") && !linha[1].equals("0")){
            int x = Integer.parseInt(linha[0]);
            int y = Integer.parseInt(linha[1]);

            if(x > 0 && y > 0) sb.append("primeiro");
            else if (x < 0 && y > 0) sb.append("segundo");
            else if (x > 0 && y < 0) sb.append("quarto");
            else sb.append("terceiro");

            sb.append("\n");

            linha = in.readLine().split(" ");
        }

        System.out.print(sb);
        in.close();
    }
}