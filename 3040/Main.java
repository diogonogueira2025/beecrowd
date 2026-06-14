import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(
            new InputStreamReader(System.in)
        );
        StringBuilder sb = new StringBuilder();
        
        int n = Integer.parseInt(in.readLine());

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(in.readLine(), " ");
            int h = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());
            int g = Integer.parseInt(st.nextToken());

            if (h >= 200 && h <= 300 && d >= 50 && g >= 150) {
                sb.append("Sim\n");
            } else {
                sb.append("Nao\n");
            }
        }
        
        System.out.print(sb);
        in.close();
    }
}
