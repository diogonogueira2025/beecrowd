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

        for(int x = 0; x < casos; x++){
            

            String linha = in.readLine();
            StringTokenizer st = new StringTokenizer(linha, " ");
            
            int tam = linha.length();
            StringBuilder[] strings = new StringBuilder[tam+1];
            
            while(st.hasMoreTokens()){
                String tokken = st.nextToken();
                
                if(strings[tokken.length()] == null){
                    strings[tokken.length()] = new StringBuilder(tokken);
                } else {
                    strings[tokken.length()].append(" ").append(tokken);
                }
            }

            boolean first = true;

            for(int i = tam; i >= 1; i--){
                StringBuilder s = strings[i];

                if(s == null) continue;

                if(!first) sb.append(" ");
                first = false;
                sb.append(s);
            }
            sb.append("\n");
        }
        System.out.print(sb);
        in.close();
    }
}