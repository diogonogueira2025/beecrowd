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

        String linha;

        while((linha = in.readLine()) != null){
            StringTokenizer st = new StringTokenizer(linha, " ");
            int h = Integer.parseInt(st.nextToken())/30;
            int m = (Integer.parseInt(st.nextToken())*5)/30;

            if(h < 10) sb.append("0");
            sb.append(h).append(":");

            if(m < 10) sb.append("0");
            sb.append(m).append("\n");          
        }
        System.out.print(sb);
        in.close();
    }
}