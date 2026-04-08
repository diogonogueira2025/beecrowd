//nao me orgulho desse codigo i-i

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;
import java.util.Comparator;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(
          new InputStreamReader(System.in)
        );

        StringBuilder sb = new StringBuilder();

        Map<String, int[]> map = new HashMap<>();

        String linha;

        while ((linha = in.readLine()) != null) {
            for (int i = 0; i < 3; i++) {
                String time = in.readLine();
                int[] med = map.getOrDefault(time, new int[3]);
                
                med[i]++;

                map.put(time, med);
            }
        }

        Map<Integer, Set<String>> map2 = new TreeMap<>(Comparator.reverseOrder());

        for (String k : map.keySet()) {
            int[] med = map.get(k);

            int pontos = med[0]*10000 + med[1]*100 + med[2];
            
            Set<String> set = map2.getOrDefault(pontos, new TreeSet<>());
            set.add(k);

            map2.put(pontos, set);
        }
        
        sb.append("Quadro de Medalhas\n");

        for (int ponto : map2.keySet()) {
            Set<String> set = map2.get(ponto);

            for (String s : set) {
                int[] med = map.get(s);

                sb.append(s).append(" ")
                .append(med[0]).append(" ")
                .append(med[1]).append(" ")
                .append(med[2]).append("\n");
            }
        }

        System.out.print(sb);
        in.close();
    }
}