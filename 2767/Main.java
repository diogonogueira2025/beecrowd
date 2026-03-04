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

        while ((linha = in.readLine()) != null){
            StringTokenizer st = new StringTokenizer(linha, " ");

            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            int[] homens = new int[n];

            StringTokenizer st2 = new StringTokenizer(in.readLine(), " ");

            
            for(int i = 0; i < n; i++){
                homens[i] = Integer.parseInt(st2.nextToken());
            }

            StringTokenizer st3 = new StringTokenizer(in.readLine(), " ");

            int[] restoMulheres = new int[k];

            for(int i = 0; i < m; i++){
                int v = Integer.parseInt(st3.nextToken());
                restoMulheres[v%k]++;
            }

            long count = 0;

            for(int i = 0; i < n; i++){
                int v = homens[i]%k;
                count += restoMulheres[(k-v)%k];
            }

            sb.append(count).append("\n");
        }
        System.out.print(sb);
        in.close();
    }
}