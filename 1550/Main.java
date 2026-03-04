import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Queue<int[]> fila = new LinkedList<>(); // [num, distancia]
        Set<Integer> visitados = new HashSet<>(); //

        int casos = Integer.parseInt(in.readLine());

        for (int i = 0; i < casos; i++) {
            String[] linha = in.readLine().split(" ");
            int num1 = Integer.parseInt(linha[0]);
            int num2 = Integer.parseInt(linha[1]);
            int acoes = 0;

            visitados.add(num1);
            fila.add(new int[] { num1, 0 });

            while (!fila.isEmpty()) {
                int[] values = fila.remove();

                int v = values[0];
                int a = values[1];

                if (v == num2) {
                    acoes = a;
                    break;
                }

                int numAdd = v + 1; // no esquerda
                int numInvertido = inverter(v); // no direita

                if (!visitados.contains(numAdd)) {
                    visitados.add(numAdd);
                    fila.add(new int[] { numAdd, a + 1 });
                }

                if (!visitados.contains(numInvertido)) {
                    visitados.add(numInvertido);
                    fila.add(new int[] { numInvertido, a + 1 });
                }
            }
            fila.clear();
            visitados.clear();

            sb.append(acoes).append("\n");
        }
        System.out.print(sb);
        in.close();
    }

    public static int inverter(int num) {
        int aux = 0;
        while (num > 0) {
            aux = aux * 10 + (num % 10);
            num /= 10;
        }
        return aux;
    }
}
