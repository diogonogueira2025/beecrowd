import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(
            new InputStreamReader(System.in)
        );
        
        String busca = in.readLine();
        String artigo = in.readLine();
        
        int tam1 = busca.length();
        int tam2 = artigo.length();
                
        int[][] dp = new int[tam1+1][tam2+1];

        for (int i = 1; i < tam1 + 1; i++) {
            char charBusca = busca.charAt(i-1);
            
            for (int j = 1; j < tam2 + 1; j++) {
                char charArtigo = artigo.charAt(j-1);

                if (charBusca == charArtigo) {
                    dp[i][j] = dp[i-1][j-1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i][j-1], dp[i-1][j]);
                }
            }
        }

        System.out.println(dp[tam1][tam2]);
        in.close();
    }
}
