import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(
          new InputStreamReader(System.in)
        );

        StringBuilder sb = new StringBuilder();

        String linha;

        while ((linha = in.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(linha, " ");

            int palavras = 0;
            int size = 0;

            while (st.hasMoreElements()) {
                String w = st.nextToken();
                char[] s = w.toCharArray();
                int tam = s.length;

                boolean ehPalavra = true;

                for (int i = 0; i < tam; i++){
                    char c = s[i];

                    if (!Character.isLetter(c)) {
                        if (i + 1 < tam || tam == 1) {
                            ehPalavra = false;
                            break;
                        } else if (c != '.') {
                            ehPalavra = false;
                            break;
                        }
                    }
                }

                if (ehPalavra) {
                    palavras++;
                    size += tam;
                    if (s[tam-1] == '.') size -= 1;
                }
            }

            if (palavras == 0) {
                sb.append("250\n");
                continue;
            }

            double media = size/palavras;
            int res = 0;

            if (media <= 3) res = 250;
            else if (media == 4 || media == 5) res = 500;
            else res = 1000;

            sb.append(res).append("\n");
        }

        System.out.print(sb);
        in.close();
    }
}