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
            char[] w1 = linha.toCharArray();
            char[] w2 = in.readLine().toCharArray();

            int tam1 = w1.length;
            int tam2 = w2.length;

            int maior = 0;
            
            for (int i = 0; i < tam1; i++) {
                char c1 = w1[i];
                

                for (int j = 0; j < tam2; j++) {
                    char c2 = w2[j];

                    if (c2 == c1) {
                        int aux = 1;

                        for (int a = i+1, b = j+1; a < tam1 && b < tam2; a++, b++) {
                            if(w1[a] != w2[b]){
                                break;
                            }
                            aux++;
                        } 
                        if(aux > maior) maior = aux;
                    }
                }
            }

            sb.append(maior).append("\n");
        }

        System.out.print(sb);
        in.close();
    }
}