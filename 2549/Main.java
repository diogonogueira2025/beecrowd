import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Set;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(
          new InputStreamReader(System.in)
        );

        StringBuilder sb = new StringBuilder();

        String linha;

        while ((linha = in.readLine()) != null) {
            StringTokenizer partes = new StringTokenizer(linha, " ");

            int n = Integer.parseInt(partes.nextToken());
            int ano = Integer.parseInt(partes.nextToken());

            Set<String> set = new HashSet<>();
            int count = 0;

            for (int i = 0; i < n; i++) {
                StringTokenizer nome = new StringTokenizer(in.readLine(), " ");
                StringBuilder carac = new StringBuilder();

                while (nome.hasMoreTokens()) {
                    carac.append(nome.nextToken().charAt(0));
                }

                carac.append(ano);

                if(!set.add(carac.toString())) {
                    count++;
                }
            }
            sb.append(count).append("\n");
        }
        
        System.out.print(sb);
        in.close();
    }
}