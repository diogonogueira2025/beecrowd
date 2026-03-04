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

        int casos = Integer.parseInt(in.readLine());

        for(int t = 0; t < casos; t++){
            StringTokenizer st = new StringTokenizer(in.readLine(), " ");

            char[] l1 = st.nextToken().toCharArray();
            char[] l2 = st.nextToken().toCharArray();

            int op = 0;

            for(int i = 0; i < l1.length; i++){
                char c1 = l1[i];
                char c2 = l2[i];

                if(c1 > c2){
                    op += ('z' - c1) + (c2 - 'a') + 1;
                } else if (c2 > c1){
                    op += c2 - c1;
                }
            }
            sb.append(op).append("\n");
        }

        System.out.print(sb);
        in.close();
    }
}