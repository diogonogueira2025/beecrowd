import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(
          new InputStreamReader(System.in)
        );

        Map<String, Integer> map = new TreeMap<>();

        char[] carac = in.readLine().toLowerCase().toCharArray();
        
        StringBuilder aux = new StringBuilder();

        for (int i = 0; i < carac.length-1; i++) {
            aux.append(carac[i]).append(carac[i+1]);

            String token = "" + carac[i] + carac[i+1];

            map.put(token, map.getOrDefault(token, 0) + 1);

            aux.setLength(0);
        }

        String token = "";
        int maior = 0;

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            int v = entry.getValue();

            if(v > maior) {
                maior = v;
                token = entry.getKey();
            }
        }

        System.out.println(token + ":" + maior);
        in.close();
    }
}