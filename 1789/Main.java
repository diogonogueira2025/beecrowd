import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();
        
        String linha;

        while ((linha = in.readLine()) != null) {
            int tam = Integer.parseInt(linha);
            StringTokenizer st = new StringTokenizer(in.readLine(), " ");

            int maior = 0;
            
            while (st.hasMoreElements()) {
                int v = Integer.parseInt(st.nextToken());

                if (v > maior) maior = v;
            }

            if (maior >= 20) {
                sb.append("3");
            } else if (maior >= 10) {
                sb.append("2");
            } else {
                sb.append("1");
            }

            sb.append("\n");
        }
        
        System.out.print(sb);
        in.close();
    }
}
