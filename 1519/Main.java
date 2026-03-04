import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

//perfeito para apresentar

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(
          new InputStreamReader(System.in)
        );

        StringBuilder sb = new StringBuilder();

        String linha = in.readLine();

        while(!linha.equals(".")){
            Map<String, Integer> map = new HashMap<>();

            String[] words = linha.split(" ");

            for(String s : words){
                map.put(s, map.getOrDefault(s, 0) + 1);
            }
            
            Map<Character, String> ini = new HashMap<>();
            Set<Character> set = new TreeSet<>();

            for(Map.Entry<String, Integer> entry : map.entrySet()){
                String s = entry.getKey();
                int tam = s.length();

                if(tam <= 2){
                    continue;
                }

                char c = s.charAt(0);
                
                int value = entry.getValue()*(tam-2);
                
                if(ini.containsKey(c)){
                    String s2 = ini.get(c);

                    int value2 = map.get(s2)*(s2.length()-2);

                    if(value > value2){
                        ini.put(c, s);
                        set.add(c);
                    }
                } else {
                    ini.put(c, s);
                    set.add(c);
                }
            }

            boolean primeiro = true;

            for(int i = 0; i < words.length; i++){
                if(!primeiro){
                    sb.append(" ");
                }
                primeiro = false;

                String s = words[i];
                char c = s.charAt(0);

                if(s.equals(ini.get(c))){
                    words[i] = String.valueOf(c) + ".";
                }

                sb.append(words[i]);
            }
            sb.append("\n");

            sb.append(ini.size()).append("\n");

            for(char c : set){
                sb.append(c).append(". = ")
                .append(ini.get(c)).append("\n");
            }
            
            linha = in.readLine();
        }

        System.out.print(sb);
        in.close();
    }
}