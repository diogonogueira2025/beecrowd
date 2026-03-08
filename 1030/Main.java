import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(
          new InputStreamReader(System.in)
        );

        StringBuilder sb = new StringBuilder();

        int casos = Integer.parseInt(in.readLine());

        for (int i = 0; i < casos; i++) {
            StringTokenizer st = new StringTokenizer(in.readLine(), " ");

            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            List<Integer> list = new ArrayList<>();

            for (int j = 1; j <= n; j++) {
                list.add(j);
            }

            int tam = n;
            int index = 0;

            while (tam > 1) {
                index = (index + k - 1)%tam;

                list.remove(index);
                tam--;
            }

            sb.append("Case ").append(i+1).append(": ")
            .append(list.remove(0)).append("\n");
        }

        System.out.print(sb);
        in.close();
    }
}