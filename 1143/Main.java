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

        for (int i = 1; i <= n; i++) {
            sb.append(i).append(" ")
            .append(pow(i, 2)).append(" ")
            .append(pow(i, 3)).append("\n");
        }

        System.out.print(sb);
        in.close();
    }

    public static int pow(int a, int e) {
        int res = 1;

        for(int i = 0; i < e; i++){
            res *= a;
        }

        return res;
    }
}