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

        for (int i = 0; i < casos; i++) {
            String[] linha = in.readLine().split(" ");
            sb.append(Integer.parseInt(linha[0]) + Integer.parseInt(linha[1]))
            .append("\n");
        }

        System.out.print(sb);
        in.close();
    }
}
