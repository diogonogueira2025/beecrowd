import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(
          new InputStreamReader(System.in)
        );

        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(in.readLine());

        while (n != 0) {
            int[][] matriz = new int[n][n];
            int linhaCima = 0;
            int linhaBaixo = n - 1;
            int colEsq = 0;
            int colDir = n - 1;
            int a = 1;

            while (linhaCima < n) {
                for (int i = linhaCima; i <= linhaBaixo; i++) {
                    for (int j = colEsq; j <= colDir; j++) {
                        matriz[i][j] = a;
                    }
                }
                linhaCima++;
                linhaBaixo--;
                colEsq++;
                colDir--;
                a++;
            }

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (j != 0) sb.append(" ");

                    int value = matriz[i][j];

                    if (value < 10) {
                        sb.append("  ");
                    } else if (value < 100) {
                        sb.append(" ");
                    }

                    sb.append(value);
                }
                sb.append("\n");
            }
            sb.append("\n");
            n = Integer.parseInt(in.readLine());
        }

        System.out.print(sb);
        in.close();
    }
}
