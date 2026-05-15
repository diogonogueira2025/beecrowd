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
            for (int i = 0; i < linha.length(); i++) {
                char c = linha.charAt(i);

                switch(c) {
                    case '@':
                        c = 'a';
                        break;
                    case '&':
                        c = 'e';
                        break;
                    case '!':
                        c = 'i';
                        break;
                    case '*':
                        c = 'o';
                        break;
                    case '#':
                        c = 'u';
                        break;
                }

                sb.append(c);
            }
            sb.append("\n");
        }
        
        System.out.print(sb);
        in.close();
    }
}
