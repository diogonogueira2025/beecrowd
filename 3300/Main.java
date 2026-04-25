import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(
          new InputStreamReader(System.in)
        );
        
        StringBuilder sb = new StringBuilder();
        
        String linha = in.readLine();
        
        boolean achou = false;
        boolean malaSuerte = false;
        
        for (int i = 0; i < linha.length(); i++) {
            char c = linha.charAt(i);
            
            if (c == '1') {
                achou = true;
                continue;
            }
            
            if (c == '3') {
                if (achou) {
                    malaSuerte = true;
                    break;
                }
            }
            
            achou = false;
        }
        
        sb.append(linha);

        if (malaSuerte) {
            sb.append(" es de Mala Suerte\n");  
        } else {
            sb.append(" NO es de Mala Suerte\n");
        }

        System.out.print(sb);
        in.close();
    }
}
