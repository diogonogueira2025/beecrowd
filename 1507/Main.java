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

        for(int t = 0; t < casos; t++){
            char[] frase = in.readLine().toCharArray();
            
            int testes = Integer.parseInt(in.readLine());

            for(int r = 0; r < testes; r++){
                char[] teste = in.readLine().toCharArray();
                int tam = teste.length;
                int i = 0;
                int j = 0;

                while(i < tam && j < frase.length){
                    char c = frase[j];

                    if(c == teste[i]) i++;
                    j++;
                }

                if(i == tam) sb.append("Yes\n");
                else sb.append("No\n");
            }
        }

        System.out.print(sb);
        in.close();
    }
}