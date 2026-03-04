import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(
          new InputStreamReader(System.in)
        );

        StringBuilder sb = new StringBuilder();

        String linha;
        Set<String> mortos = new HashSet<>();
        Map<String, Integer> map = new TreeMap<>();

        while((linha = in.readLine()) != null){
            StringTokenizer st = new StringTokenizer(linha, " ");

            String p1 = st.nextToken();
            String p2 = st.nextToken();

            if(mortos.add(p2)){
                map.remove(p2);
            }

            if(!mortos.contains(p1)){
                map.put(p1, 1 + map.getOrDefault(p1, 0));
            }
        }

        sb.append("HALL OF MURDERERS\n");
        for(Map.Entry<String, Integer> entry : map.entrySet()){
            sb.append(entry.getKey()).append(" ").append(entry.getValue()).append("\n");
        }

        System.out.print(sb);
        in.close();
    }
}