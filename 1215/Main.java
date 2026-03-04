import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(
          new InputStreamReader(System.in)
        );

        StringBuilder sb = new StringBuilder();

        PriorityQueue<String> fila = new PriorityQueue<>();
        Set<String> set = new HashSet<>();

        String linha;

        while((linha = in.readLine())!= null){
            if(linha.isBlank()) continue;
            String[] words = linha.toLowerCase().split("[^a-zA-Z]+");

            for(String w : words){
                if(!set.contains(w)){
                    fila.add(w);
                    set.add(w);
                }
            }
        }

        while(!fila.isEmpty()){
            String word = fila.remove();
            if(!word.isBlank()){
                sb.append(word).append("\n");
            }
        }

        System.out.print(sb);
        in.close();
    }
}