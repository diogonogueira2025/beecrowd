import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(
          new InputStreamReader(System.in)
        );

        int casos = Integer.parseInt(in.readLine());

        Stack<String> pilha = new Stack<>();
        pilha.add("ECAF");
        
        int count = 0;

        for (int t = 0; t < casos; t++) {
            if (pilha.isEmpty()) pilha.add("ECAF");

            StringTokenizer st = new StringTokenizer(in.readLine(), " ");

            StringBuilder sb = new StringBuilder();

            while (st.hasMoreTokens()) {
                sb.append(st.nextToken());
            }

            String s = sb.toString();

            if (pilha.peek().equals(s)) {
                pilha.pop();
                count++;
            } else {
                pilha.push(reverse(s));
            }
        }

        System.out.println(count);
        in.close();
    }

    public static String reverse(String s) {
        StringBuilder sb = new StringBuilder();
        char[] carac = s.toCharArray();

        for (int i = s.length() - 1; i >= 0; i--) {
            sb.append(carac[i]);
        }

        return sb.toString();
    }
}