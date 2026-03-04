import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(
            new InputStreamReader(System.in)
        );

        StringBuilder sb = new StringBuilder();

        String l;

        while((l = in.readLine()) != null){
            int e = Integer.parseInt(l);

            String[] linha = in.readLine().split("\\s+");
            int[] seq = new int[e];
            
            long soma = 0;

            for(int i = 0; i < e; i++){
                int v = Integer.parseInt(linha[i]);
                seq[i] = v;
                soma += v;
            }
            long somaRangel = 0;
            long menor = soma;

            for(int i = 0; i < e-1; i++){
                somaRangel += seq[i];

                long somaGugu = soma - somaRangel;
                long dif = abs(somaRangel-somaGugu);

                if(dif < menor){
                    menor = dif;
                }

            }
            sb.append(menor).append("\n");
        }

        System.out.print(sb);
        in.close();
    }
    public static long abs(long n){
        if(n < 0) return -n;
        return n;
    }
}