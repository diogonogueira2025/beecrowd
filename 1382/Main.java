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

        for(int i = 0; i < casos; i++){
            int tam = Integer.parseInt(in.readLine());
            int[] seq = new int[tam];

            StringTokenizer st = new StringTokenizer(in.readLine(), " ");

            for(int a = 0; a < tam; a++){
                seq[a] = Integer.parseInt(st.nextToken());
            }

            int count = 0;
            int trocas = 0;

            while(count < tam){
                count = 0;

                for(int e = 1; e <= tam; e++){
                    int v = seq[e-1]; //valor da sequencia
                    if(v != e){
                        int aux = seq[v-1];
                        seq[e-1] = aux;
                        seq[v-1] = v;
                        trocas++;
                    } else {
                        count++;
                    }
                }
            }
            sb.append(trocas).append("\n");

        }
        System.out.print(sb);
        in.close();
    }
}
