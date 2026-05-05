import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(
            new InputStreamReader(System.in)
        );

        String a = in.readLine();
        int b = Integer.parseInt(in.readLine());

        int resto = 0;

        for (int i = 0; i < a.length(); i++) {
            int v = a.charAt(i) - '0';
            resto = (resto*10 + v)%b;
        }

        System.out.println(resto);
        in.close();
    }
}
