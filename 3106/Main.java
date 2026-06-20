import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(
            new InputStreamReader(System.in)
        );

        int n = Integer.parseInt(in.readLine());

        StringTokenizer st = new StringTokenizer(in.readLine());

        int count = 0;

        for (int i = 0; i < n; i++) {
            int v = Integer.parseInt(st.nextToken());
            count += v - v%3;
        }

        System.out.println(count);

        in.close();
    }
}
