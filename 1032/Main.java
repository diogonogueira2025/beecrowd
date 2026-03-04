import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(
          new InputStreamReader(System.in)
        );
        List<Integer> lista = new LinkedList<>();

        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(in.readLine());
        boolean[] primos = new boolean[100_000+1];
        
        crivo(primos);

        while(n != 0){
            lista.clear();
            int primo = 2;

            for(int i = 1; i <= n; i++){
                lista.add(i);
            }

            int tam = n;
            int indice = 0;

            for(int i = 0; i < n - 1; i++){
                indice = (indice + primo - 1) % tam;
                
                lista.remove(indice);
                tam--;

                for(int p = primo+1; p < 100_000; p++){
                    if(primos[p]){
                        primo = p;
                        break;
                    }
                }
            }
            sb.append(lista.remove(0)).append("\n");
            //final
            n = Integer.parseInt(in.readLine());
        }
        System.out.print(sb);
        in.close();
    }
    public static void crivo(boolean[] primos){
        Arrays.fill(primos, true);
        primos[0] = false;
        primos[1] = false;

        for(int i = 2; i * i <= 100_000; i ++){
            if(primos[i]){
                for(int j = i*i; j <= 100_000; j += i){
                    primos[j] = false;
                }
            }
        }
    }
}