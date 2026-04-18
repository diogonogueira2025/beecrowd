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

        int[] dig = new int[] {
            2, 2, 2, 3, 3, 3,
            4, 4, 4, 5, 5, 5,
            6, 6, 6, 7, 7, 7, 7,
            8, 8, 8, 9, 9, 9, 9
        };

        String linha;

        while ((linha = in.readLine()) != null) {
            for (int i = 0; i < linha.length(); i++) {
                char c = linha.charAt(i);

                if ((c >= 'a' && c <= 'z')) {
                    sb.append(dig[c-'a']);
                } else if (c >= 'A' && c <= 'Z') {
                    sb.append(dig[c-'A']);
                } else if (c >= '0' && c <= '9') {
                    sb.append(c);
                } else if (c == '*' || c == '#') {
                    sb.append(c);
                } 
            }

            sb.append("\n");
        }

        System.out.print(sb);
        in.close();
    }
}