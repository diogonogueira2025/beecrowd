import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(
            new InputStreamReader(System.in)
        );

        StringBuilder sb = new StringBuilder();
        
        Set<String> yes = new TreeSet<>();
        Set<String> no = new TreeSet<>();

        String linha = in.readLine();
        String maior = "";

        while(!linha.equals("FIM")){
            StringTokenizer st = new StringTokenizer(linha, " ");

            String p = st.nextToken();

            if(st.nextToken().equals("YES")){
                yes.add(p);
                if(p.length() > maior.length()){
                    maior = p;
                }
            } else {
                no.add(p);
            }

            linha = in.readLine();
        }

        for(String p : yes){
            sb.append(p).append("\n");
        }

        for(String p : no){
            sb.append(p).append("\n");
        }

        sb.append("\nAmigo do Habay:\n").append(maior).append("\n");
        
        System.out.print(sb);
        in.close();
    }
}