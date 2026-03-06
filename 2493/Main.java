import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(
          new InputStreamReader(System.in)
        );

        StringBuilder sb = new StringBuilder();

        String linha;

        while ((linha = in.readLine()) != null) {
            linha = linha.trim();
            if(linha.isEmpty()) continue;
            
            int t = Integer.parseInt(linha);

            int[][] exp = new int[t][6];
            Map<String, Boolean> map = new TreeMap<>();

            for (int i = 0; i < t; i++) {
                String[] partes = in.readLine().split(" ");
                int a = Integer.parseInt(partes[0]);

                String[] partes2 = partes[1].split("=");
                int b = Integer.parseInt(partes2[0]);
                int res = Integer.parseInt(partes2[1]);

                exp[i] = new int[]{a, b, res, a+b, a-b, a*b};
            }
            
            int count = 0;

            for (int i = 0; i < t; i++) {
                StringTokenizer st = new StringTokenizer(in.readLine(), " ");
                
                String name = st.nextToken();
                int index = Integer.parseInt(st.nextToken()) - 1;
                char op = st.nextToken().charAt(0);

                int res = exp[index][2];

                int r1 = exp[index][3];
                int r2 = exp[index][4];
                int r3 = exp[index][5];

                boolean correto = false;

                if (op == '+') {
                    correto = r1 == res;
                } else if (op == '-') {
                    correto = r2 == res;
                } else if (op == '*') {
                    correto = r3 == res;
                } else if (op == 'I'){
                    correto = r1 != res && r2 != res && r3 != res;
                }

                map.put(name, correto);

                if (correto) {
                    count++;
                }
            }

            if(count == 0) {
                sb.append("None Shall Pass!\n");
            } else if (count == t) {
                sb.append("You Shall All Pass!\n");
            } else {
                boolean primeiro = true;

                for(Map.Entry<String, Boolean> entry : map.entrySet()) {
                    if (!entry.getValue()) {
                        if(!primeiro) sb.append(" ");

                        sb.append(entry.getKey());
                        primeiro = false;
                    }
                }

                sb.append("\n");
            }
        }

        System.out.print(sb);
        in.close();
    }
}