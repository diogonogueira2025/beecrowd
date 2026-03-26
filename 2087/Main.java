import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(
          new InputStreamReader(System.in)
        );

        StringBuilder sb = new StringBuilder();

        int casos = Integer.parseInt(in.readLine());

        while (casos != 0) {
            String[] w = new String[casos];

            for (int t = 0; t < casos; t++) {
                w[t] = in.readLine();
            }
            boolean ruim = false;

            for (int i = 0; i < casos-1; i++) {
                for (int j = i+1; j < casos; j++) {
                    if (prefix(w[i], w[j])) {
                        ruim = true;
                        break;
                    }
                }
                if (ruim) break;
            }

            if (ruim) sb.append("Conjunto Ruim\n");
            else sb.append("Conjunto Bom\n");

            casos = Integer.parseInt(in.readLine());
        }

        System.out.print(sb);
        in.close();
    }

    public static boolean prefix(String a, String b) {
        for (int i = 0, j = 0; i < a.length() && j < b.length(); i++, j++) {
            if (a.charAt(i) != b.charAt(j)) return false;
        }

        return true;
    }
}