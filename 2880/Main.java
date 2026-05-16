import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(
          new InputStreamReader(System.in)
        );

        String cifrada = in.readLine();
        String crib = in.readLine();
        int tam = cifrada.length();

        int count = 0;
        
        for (int i = 0; i < tam; i++) {
            char c = cifrada.charAt(i);
            int tamCrib = crib.length();

            if (c != crib.charAt(0) && i + tamCrib - 1 < tam) {
                boolean posicaoPossivel = true;
                
                for (int j = 1; j < tamCrib; j++) {
                    char c2 = crib.charAt(j);

                    if (c2 == cifrada.charAt(j+i)) {
                        posicaoPossivel = false;
                        break;
                    }
                }

                if (posicaoPossivel) count++;
            }
        }
        
        System.out.println(count);
        in.close();
    }
}
