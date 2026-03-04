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
        char[] cobol = new char[] {'c', 'o', 'b', 'o', 'l'};

        while((linha = in.readLine()) != null){
            StringTokenizer st = new StringTokenizer(linha, "-");

            boolean deu = true;

            for(int i = 0; i < 5; i++){
                char c = cobol[i];

                char[] p = st.nextToken().toLowerCase().toCharArray();

                if(p[0] != c && p[p.length - 1] != c){
                    deu = false;
                    break;
                }
            }

            if(deu){
                sb.append("GRACE HOPPER\n");
            } else {
                sb.append("BUG\n");
            }
        }

        System.out.print(sb);
        in.close();
    }
}