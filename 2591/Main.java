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

        int c = Integer.parseInt(in.readLine());

        for (int i = 0; i < c; i++) {
            StringTokenizer st = new StringTokenizer(in.readLine(), "k");

            int x = countLetterA(st.nextToken());
            int y = countLetterA(st.nextToken());

            sb.append("k").append("a".repeat(x*y)).append("\n");
        }

        System.out.print(sb);
        in.close();
    }

    public static int countLetterA(String s) {
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') count++;
        }

        return count;
    }
}
