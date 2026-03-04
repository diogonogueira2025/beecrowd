import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(
          new InputStreamReader(System.in)
        );
        Map<String, ArrayList<Integer>> map = new HashMap<>();

        //lendo o texto
        String texto = in.readLine();
        
        //lendo a quantidade de palavras para verificar
        int qnt = Integer.parseInt(in.readLine());
        
        //pegando as palavras
        StringTokenizer words = new StringTokenizer(in.readLine(), " ");

        StringTokenizer st = new StringTokenizer(texto);
        int i = 0;

        while(st.hasMoreTokens()){
            String w = st.nextToken();

            ArrayList<Integer> list = map.getOrDefault(w, new ArrayList<>());
            list.add(i);

            map.put(w, list);

            i += w.length() + 1;
        }

        StringBuilder sb = new StringBuilder();

        for(int j = 0; j < qnt; j++){
            ArrayList<Integer> list = map.get(words.nextToken());

            if(list != null){
                boolean primeiro = true;

                for(int pos : list){
                    if(!primeiro){
                        sb.append(" ");
                    }

                    primeiro = false;
                    sb.append(pos);
                }
                
                sb.append("\n");
            } else {
                sb.append("-1\n");
            }
        }
        System.out.print(sb);
        in.close();
    }
}