import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader in = new BufferedReader(
          new InputStreamReader(System.in)
        );

        StringBuilder sb = new StringBuilder();

        String linha;

        while((linha = in.readLine()) != null)
        {
            StringTokenizer nums = new StringTokenizer(linha, " ");

            int n = Integer.parseInt(nums.nextToken()); // n de palavras
        
            int l = Integer.parseInt(nums.nextToken()); // n max de linhas por pagina
            int c = Integer.parseInt(nums.nextToken()); // n max de chars por linha

            StringTokenizer st = new StringTokenizer(in.readLine(), " ");

            int carac = 0;
            int linhas = 1;

            for(int i = 0; i < n; i++){ 
                String p = st.nextToken();
                int tam = p.length();
                int res = tam + 1;
                
                if(carac + tam <= c){
                    carac += res;
                } else {
                    linhas++;
                    carac = res;
                }
            }

            sb.append(Math.ceilDiv(linhas, l)).append("\n");
        }
        
        System.out.print(sb);
        in.close();
    }
}