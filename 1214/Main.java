import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(
          new InputStreamReader(System.in)
        );
        Locale.setDefault(Locale.US);

        StringBuilder sb = new StringBuilder();

        DecimalFormat df = new DecimalFormat("0.000");

        int casos = Integer.parseInt(in.readLine());
        
        for(int i = 0; i < casos; i++){
            StringTokenizer st = new StringTokenizer(in.readLine(), " ");
            int qnt = Integer.parseInt(st.nextToken());

            int[] notas = new int[qnt];
            int soma = 0; 

            for(int j = 0; j < qnt; j++){
                int v = Integer.parseInt(st.nextToken());
                notas[j] = v;
                soma += v;
            }
            
            double media = (double) soma/qnt;

            int alunosNaMedia = 0;

            for(int j = 0; j < qnt; j++){
                if(notas[j] > media){
                    alunosNaMedia++;
                }
            }
            double rf = alunosNaMedia*100.0/qnt;
            sb.append(df.format(rf)).append("%\n");
        }
        System.out.print(sb);
        in.close();
    }
}
