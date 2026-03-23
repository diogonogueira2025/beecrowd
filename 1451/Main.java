import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(
          new InputStreamReader(System.in)
        );

        StringBuilder sb = new StringBuilder();

        String linha;

        while ((linha = in.readLine()) != null) {
            Deque<String> fila = new ArrayDeque<>();

            boolean inicio = false;
            
            StringBuilder parte = new StringBuilder();

            for (char c : linha.toCharArray()) {
                if (c == '[' || c == ']') {
                    if (inicio) fila.addFirst(parte.toString());
                    else fila.addLast(parte.toString());

                    parte.setLength(0);

                    inicio = c == '[';
                } else {
                    parte.append(c);
                }
            }

            if (parte.length() > 0) {
                if (inicio) fila.addFirst(parte.toString());
                else fila.addLast(parte.toString());
            }

            while (!fila.isEmpty()) {
                sb.append(fila.removeFirst());
            }

            sb.append("\n");
        }

        System.out.print(sb);
        in.close();
    }
}