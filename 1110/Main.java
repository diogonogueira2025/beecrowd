import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(
          new InputStreamReader(System.in)
        );

        StringBuilder sb = new StringBuilder();

        Queue<Integer> discard = new LinkedList<>();
        LinkedList<Integer> pilha = new LinkedList<>();

        int cartas = Integer.parseInt(in.readLine());

        while(cartas != 0){
            for(int i = 1; i <=cartas; i++){
                pilha.add(i);
            }

            while(pilha.size() >= 2){
                discard.add(pilha.removeFirst());

                pilha.addLast(pilha.removeFirst());
            }

            sb.append("Discarded cards: ");
            boolean first = true;
            
            for(int v : discard){
                if(!first) sb.append(", ");
                first = false;

                sb.append(v);
            }
            
            sb.append("\nRemaining card: ").append(pilha.get(0)).append("\n");

            discard.clear();
            pilha.clear();
            cartas = Integer.parseInt(in.readLine());
        }

        System.out.print(sb);
        in.close();
    }
}