import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(
          new InputStreamReader(System.in)
        );

        String linha = in.readLine().toLowerCase();
        boolean bolado = false;
        int tam = linha.length();
        
        for (int i = 0; i < tam; i++) {
            char c = linha.charAt(i);
            
            if (c == 'z' && i + 4 < tam && linha.substring(i, i + 5).equals("zelda")) {
                bolado = true;
                break;
            }
        }
        
        if (bolado) {
            System.out.println("Link Bolado");
        } else {
            System.out.println("Link Tranquilo");
        }
        
        in.close();
    }
}
