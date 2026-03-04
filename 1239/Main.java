import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(
          new InputStreamReader(System.in)
        );

        StringBuilder sb = new StringBuilder();

        String linha;
        
        while((linha = in.readLine()) != null){   
            boolean tagi = false;
            boolean tagb = false;

            for(char c : linha.toCharArray()) {
                switch (c) {
                    case '_':
                        if(tagi) sb.append("</i>");
                        else sb.append("<i>");
                        tagi = !tagi;
                        break;
                    case '*':
                        if(tagb) sb.append("</b>");
                        else sb.append("<b>");
                        tagb = !tagb;
                        break;
                    default:
                        sb.append(c);
                        break;
                }
            }
            sb.append("\n");
        }
        System.out.print(sb);
        in.close();
    }
}
