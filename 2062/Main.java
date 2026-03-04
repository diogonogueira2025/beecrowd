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

        int n = Integer.parseInt(in.readLine());

        StringTokenizer st = new StringTokenizer(in.readLine());
        
        boolean primeiro = true;

        for(int i = 0; i < n; i++){
            if(!primeiro){
                sb.append(" ");
            }
            primeiro = false;

            String w = st.nextToken();

            char[] p = w.toCharArray();

            if(p.length == 3 && ((p[0] == 'O' && p[1] == 'B') || (p[0] == 'U' && p[1] == 'R'))){
                p[2] = 'I';
                sb.append(String.valueOf(p));
            } else {
                sb.append(w);
            }
        }

        System.out.println(sb);
        in.close();
    }
}