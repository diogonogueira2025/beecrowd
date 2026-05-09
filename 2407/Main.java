//fazer esta bagaça de novo KKKKKKKKKKK
// código véi prodre

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(
            new InputStreamReader(System.in)
        );
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(in.readLine());

        int diagP = 0;
        int diagS = 0;

        int soma = 0;
        int[] somaColuna = new int[n];

        int somaDig = 0;
        int dig = ((n*n)*(n*n + 1))/2;

        boolean ehMagico = true;

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(in.readLine(), " ");

            int somaAux = 0;

            for (int j = 0; j < n; j++) {
                int value = Integer.parseInt(st.nextToken());

                somaDig += value;

                somaColuna[j] += value;
                somaAux += value;

                if (i == j) diagP += value;
                if (i + j + 1 == n) diagS += value;

                if (i == 0) soma += value;
            }

            if (somaAux != soma) {
                ehMagico = false;
                break;
            }
        }

        if (ehMagico && diagP == soma && diagS == soma && dig == somaDig) {
            for (int i = 0; i < n; i++) {
                if (somaColuna[i] != soma) {
                    ehMagico = false;
                    break;
                }
            }

            if (ehMagico) sb.append(soma).append("\n");
            else sb.append("0\n");
        } else {
            sb.append("0\n");
        }

        System.out.print(sb);
        in.close();
    }
}
