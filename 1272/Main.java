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

        int testes = Integer.parseInt(in.readLine());

        for(int t = 0; t < testes; t++){
            StringTokenizer st = new StringTokenizer(in.readLine(), " ");

            while(st.hasMoreTokens()){
                sb.append(st.nextToken().charAt(0));
            }

            sb.append("\n");
        }
        System.out.print(sb);
        in.close();
    }
}