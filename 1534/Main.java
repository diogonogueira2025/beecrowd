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

        while ((linha = in.readLine()) != null) {
            int n = Integer.parseInt(linha);

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (i + j == n - 1) {
                        sb.append(2);
                    } else if (i == j) {
                        sb.append(1);
                    } else {
                        sb.append(3);
                    }
                }
                sb.append("\n");
            }
        }

        System.out.print(sb);
        in.close();
    }
}
