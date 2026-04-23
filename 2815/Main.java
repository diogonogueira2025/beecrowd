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

        StringTokenizer st = new StringTokenizer(in.readLine(), " ");
        boolean primeiro = true;

        while (st.hasMoreElements()) {
            if (!primeiro) sb.append(" ");
            primeiro = false;

            String s = st.nextToken();
            int tam = s.length();

            char[] silaba = new char[2];

            for (int i = 0; i < s.length(); i += 2) {
                char c1 = s.charAt(i);

                if (i+1 >= tam) {
                    sb.append(c1);
                    continue;
                }

                char c2 = s.charAt(i+1);

                if(c1 == silaba[0] && c2 == silaba[1]) {
                    silaba[0] = ' ';
                    silaba[1] = ' ';
                } else {
                    sb.append(c1).append(c2);
                    silaba[0] = c1;
                    silaba[1] = c2;
                }
            }
        }

        System.out.println(sb);
        in.close();
    }
}
