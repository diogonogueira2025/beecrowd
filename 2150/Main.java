import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(
          new InputStreamReader(System.in)
        );

        StringBuilder sb = new StringBuilder();

        String linha;

        while ((linha = in.readLine()) != null) {
            String frase = in.readLine();
            if (frase == null) {
                continue;
            }
            Set<Character> set = new HashSet<>();
            
            for (int i = 0; i < linha.length(); i++) {
                set.add(linha.charAt(i)); 
            }

            int count = 0;

            for (int i = 0; i < frase.length(); i++) {
                char c = frase.charAt(i);

                if (set.contains(c)) count++;
            }

            sb.append(count).append("\n");
        }
        
        System.out.print(sb);
        in.close();
    }
}
