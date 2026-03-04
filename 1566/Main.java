import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader((System.in)));
        StringBuilder sb = new StringBuilder();
        TreeMap<Integer, Integer> map = new TreeMap<>();

        int casos = Integer.parseInt(in.readLine());

        for(int i = 0; i < casos; i++){
            int pessoas = Integer.parseInt(in.readLine());


            StringTokenizer st = new StringTokenizer(in.readLine(), " ");
            
            for(int j = 0; j < pessoas; j++){
                int peso = Integer.parseInt(st.nextToken());
                map.put(peso, map.getOrDefault(peso, 0) + 1);
            }
            
            for(Map.Entry<Integer, Integer> entry : map.entrySet()){
                int altura = entry.getKey();
                int qnt = entry.getValue();

                for(int j = 0; j < qnt; j++){
                    sb.append(altura).append(" ");
                }
            }

            sb.deleteCharAt(sb.length() - 1);
            sb.append("\n");
            System.out.print(sb);

            sb.setLength(0);
            map.clear();
        }
        in.close();
    }
}
