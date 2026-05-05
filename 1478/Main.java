//não me orgulho desse código, mas ficou diferente B)

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(
          new InputStreamReader(System.in)
        );

        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(in.readLine());

        boolean primeiro = true;

        while (n != 0) {
            if (!primeiro) sb.append("\n");
            primeiro = false;

            for (int i = 1; i <= n; i++) {
                int esq = i;
                int dir = 1;

                for (int j = 1; j <= n; j++) {
                    if (j != 1) {
                        sb.append(" ");
                    }

                    int value = 0;

                    if (esq > 1) {
                        value = esq--;
                    } else {
                        value = dir++;
                    }

                    if (value < 10) {
                        sb.append("  ");
                    } else if (value < 100) {
                        sb.append(" ");
                    }

                    sb.append(value);
                }
                sb.append("\n");
            }
            n = Integer.parseInt(in.readLine());
        }

        System.out.println(sb);
        in.close();
    }
}
