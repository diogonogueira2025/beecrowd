import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(
          new InputStreamReader(System.in)
        );

        StringBuilder sb = new StringBuilder();

        String a = in.readLine();
        
        int instance = 1;
        boolean primeiro = true;
        
        while (!a.equals("0")) {
            String linha = in.readLine();
            
            if (!primeiro) sb.append("\n");

            primeiro = false;
            
            int tam = linha.length();

            boolean achou = false;
            
            for (int i = 0; i < tam; i++) {
                char c = linha.charAt(i);

                if (c == a.charAt(0) && i + a.length() - 1 < tam && linha.substring(i, i + a.length()).equals(a)) {
                    achou = true;
                    break;
                }
            }

            sb.append("Instancia ").append(instance++).append("\n")
            .append(achou ? "verdadeira" : "falsa").append("\n");
            
            a = in.readLine();
        }
        
        System.out.print(sb);
        in.close();
    }
}
