import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(
            new InputStreamReader(System.in)
        );
        int[] mult = new int[4];

        int n = Integer.parseInt(in.readLine());
        StringTokenizer st = new StringTokenizer(in.readLine(), " ");

        for (int i = 0; i < n; i++) {
            int value = Integer.parseInt(st.nextToken());

            if (value % 2 == 0) {
                mult[0]++;
                if (value % 4 == 0) mult[2]++;
            }
            if (value % 3 == 0) {
                mult[1]++;
            }
            if (value % 5 == 0) {
                mult[3]++;
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 4; i++) {
            sb.append(mult[i])
            .append(" Multiplo(s) de ")
            .append(i + 2)
            .append("\n");
        }

        System.out.print(sb);
        in.close();
    }
}
