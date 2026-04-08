import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static int[][] coord = {
        {-1, -1}, {-1, 0}, {-1, 1},
        {0, -1}, {0, 1},
        {1, -1}, {1, 0}, {1, 1}
    };

    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(
          new InputStreamReader(System.in)
        );

        StringBuilder sb = new StringBuilder();

        String[] linha = in.readLine().split(" ");

        int n = Integer.parseInt(linha[0]);
        int m = Integer.parseInt(linha[1]);

        int[][] matriz = new int[n][m];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(in.readLine(), " ");

            for (int j = 0; j < m; j++) {
                matriz[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int[] par = ehSabre(matriz, n, m);

        sb.append(par[0]).append(" ").append(par[1]);

        System.out.println(sb);
        in.close();
    }

    public static int[] ehSabre(int[][] matriz, int n, int m) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int v = matriz[i][j];

                if (v == 42) {
                    boolean achou = true;

                    for (int[] par : coord) {
                        int x = par[0] + i;
                        int y = par[1] + j;

                        if (x >= n || x < 0 || y >= m || y < 0 || matriz[x][y] != 7) {
                            achou = false; 
                            break;
                        }
                    }

                    if (achou) {
                        return new int[]{i+1, j+1}; 
                    }
                }
            }
        }

        return new int[]{0, 0};
    }
}