import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(
            new InputStreamReader(System.in)
        );
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(in.readLine());

        for (int i = 1; i <= n; i++) {
            int mult = i*i;

            sb.append(i).append(" ")
            .append(mult).append(" ")
            .append(i*mult).append("\n");

            sb.append(i).append(" ")
            .append(mult + 1).append(" ")
            .append(i*mult + 1).append("\n");
        }

        System.out.print(sb);
        in.close();
    }
}
