import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(
            new InputStreamReader(System.in)
        );
        //input
        String s1 = in.readLine();
        String s2 = in.readLine();

        int tam = longestCommonSubsequence(s1, s2);

        System.out.println(tam);
        in.close();
    }

    public static int longestCommonSubsequence(String s1, String s2) {
        //pegando os tamanhos
        int tam1 = s1.length();
        int tam2 = s2.length();

        //matriz para verificar o lcs
        int[][] dp = new int[tam1 + 1][tam2 + 1];

        for (int i = 1; i < tam1 + 1; i++) {
            char c = s1.charAt(i-1);
            for (int j = 1; j < tam2 + 1; j++) {
                if (c == s2.charAt(j-1)) {
                    dp[i][j] = dp[i-1][j-1] + 1;
                } else {
                    dp[i][j] = max(dp[i][j-1], dp[i-1][j]);
                }
            }
        }

        return dp[tam1][tam2];
    }

    public static int max(int v1, int v2) {
        return (v1 > v2) ? v1 : v2;
    }
}
