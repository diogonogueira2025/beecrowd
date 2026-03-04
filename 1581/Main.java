import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(
          new InputStreamReader(System.in)
        );

        StringBuilder sb = new StringBuilder();

        int casos = Integer.parseInt(in.readLine());

        for(int k = 0; k < casos; k++){
            int pessoas = Integer.parseInt(in.readLine());

            String idioma = in.readLine();
            boolean ingles = false;

            for(int i = 1; i < pessoas; i++){
                String idioma2 = in.readLine();

                if(!idioma.equals(idioma2)){
                    ingles = true;
                }
            }

            if(ingles){
                sb.append("ingles\n");
            } else {
                sb.append(idioma).append("\n");
            }
            
        }
        
        System.out.print(sb);
        in.close();
    }
}