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
        
        int count = 1;

        for(int i = 0; i < n; i++){
            sb.append(count++).append(" ").append(count++).append(" ").append(count++).append(" PUM\n");
            count++;
        }

        System.out.print(sb);
        in.close();
    }
}