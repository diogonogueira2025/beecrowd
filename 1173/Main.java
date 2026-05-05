import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(
          new InputStreamReader(System.in)
        );

        StringBuilder sb = new StringBuilder();

        int v = Integer.parseInt(in.readLine());

        for (int i = 0; i < 10; i++) {
            sb.append("N[").append(i).append("] = ")
            .append(v).append("\n");

            v *= 2;
        }

        System.out.print(sb);
        in.close();
    }
}
