import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(
          new InputStreamReader(System.in)
        );

        StringBuilder sb = new StringBuilder();

        String linha;

        while ((linha = in.readLine()) != null) {
            StringBuilder builder = new StringBuilder();

            for (int i = 0; i < linha.length(); i++) {
                char c = linha.charAt(i);
                
                if (c == ',' || c == '.'){
                    int tam = builder.length();

                    if (i > 0 && tam > 0 && builder.charAt(tam-1) == ' ') {
                        builder.deleteCharAt(tam-1);
                    }
                } 
                builder.append(c);
            }

            sb.append(builder).append("\n");
        }

        System.out.print(sb);
        in.close();
    }
}