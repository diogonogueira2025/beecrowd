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

        for(int i = 0; i < casos; i++){
            boolean[] alfa = new boolean[26];

            char[] letras = in.readLine().toCharArray();
            int tam = letras.length;
            int count = 0;

            for (int a = 0; a < tam; a++){
                char c = letras[a];
                
                if(c != ' ' && c != ','){
                    int indice = c - 'a';

                    if(!alfa[indice]){
                        alfa[indice] = true;
                        count++;
                    }
                }
            }

            if(count == 26){
                sb.append("frase completa\n");
            } else if (count >= 13){
                sb.append("frase quase completa\n");
            } else {
                sb.append("frase mal elaborada\n");
            }
        }

        System.out.print(sb);
        in.close();
    }
}