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

        while((linha = in.readLine()) != null){
            char[] carac = linha.toCharArray();

            int tam = carac.length;

            boolean up = true;

            for(int i = 0; i < tam; i++){
                char c = carac[i];
                
                if(Character.isAlphabetic(c)){
                    if(up){
                        carac[i] = Character.toUpperCase(c);
                    } else {
                        carac[i] = Character.toLowerCase(c);
                    }
                    up = !up;
                }
            }

            sb.append(carac).append("\n");
        }
        System.out.print(sb);
        in.close();
    }
}