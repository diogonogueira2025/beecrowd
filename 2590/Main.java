import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(
          new InputStreamReader(System.in)
        );

        StringBuilder sb = new StringBuilder();

        int[] alg = new int[] {1, 7, 9, 3};

        int casos = Integer.parseInt(in.readLine());

        for(int i = 0; i < casos; i++){
            int n = Integer.parseInt(in.readLine());
            sb.append(alg[n%4]).append("\n");
        }

        System.out.print(sb);
        in.close();
    }
}