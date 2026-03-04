import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(
          new InputStreamReader(System.in)
        );

        StringBuilder sb = new StringBuilder();

        Map<Character, Integer> map = new HashMap<>();
        map.put('A', 6);
        map.put('B', 8);
        map.put('C', 7);
        map.put('D', 5);
        map.put('E', 2);
        map.put('F', 3);
        map.put('G', 0);
        map.put('H', 9);
        map.put('I', 1);
        map.put('J', 4);
        map.put('K', 6);
        map.put('L', 8);
        map.put('M', 7);
        map.put('N', 5);
        map.put('O', 2);
        map.put('P', 3);
        map.put('Q', 0);
        map.put('R', 9);
        map.put('S', 1);
        map.put('T', 4);
        map.put('U', 6);
        map.put('W', 7);
        map.put('X', 5);
        map.put('Y', 2);
        map.put('Z', 3);

        int casos = Integer.parseInt(in.readLine());
        
        for(int i = 0; i < casos; i++){
            char[] letras = in.readLine().replace(" ", "").toCharArray();
            int tam = letras.length;
            int limit = (tam < 12) ? tam : 12;

            for(int j = 0; j < limit; j++){
                char c = letras[j];

                if(c >= 'a' && c <= 'z'){
                    sb.append((c - 'a')%10);

                } else if(c >= 'A' && c <= 'Z'){
                    sb.append(map.get(c));
                }
            }
            sb.append("\n");
        }
        System.out.print(sb);
        in.close();
    }
}
