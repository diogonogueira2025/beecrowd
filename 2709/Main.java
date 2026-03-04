import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(
          new InputStreamReader(System.in)
        );

        StringBuilder sb = new StringBuilder();
        
        String linha;
        boolean[] primos = new boolean[10001];
        crivo(primos);

        while((linha = in.readLine()) != null){
            int n = Integer.parseInt(linha);
            int[] moedas = new int[n];

            for(int i = 0; i < n; i++){
                moedas[i] = Integer.parseInt(in.readLine().trim());
            }
            int salto = Integer.parseInt(in.readLine());

            int sum = 0;

            for(int i = n-1; i >= 0; i-=salto){
                sum += moedas[i];
            }

            if(primos[sum]) {
                sb.append("You’re a coastal aircraft, Robbie, a large silver aircraft.").append("\n");
            } else {
                sb.append("Bad boy! I’ll hit you.").append("\n");
            }
        }

        System.out.print(sb);
        in.close();
    }

    public static void crivo(boolean[] primos){
        Arrays.fill(primos, true);
        primos[0] = false;
        primos[1] = false;

        int tam = primos.length;

        for(int i = 2; i * i < tam; i++){
            if(primos[i]){
                for(int j = i*i; j < tam; j += i){
                    primos[j] = false;
                }
            }
        }
    }
}
