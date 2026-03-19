import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.TreeSet;
import java.io.IOException;
import java.util.Queue;
import java.util.Set;
import java.util.LinkedList;

public class Main {
   public static void main(String[] args) throws IOException{
       BufferedReader in = new BufferedReader(
         new InputStreamReader(System.in)
       );

       StringBuilder sb = new StringBuilder();

       String linha;
       boolean primeiro = true;

       while ((linha = in.readLine()) != null) {
           if (!primeiro) sb.append("\n");
           primeiro = false;

           Set<String> set = new TreeSet<>();
          
           Queue<String> fila = new LinkedList<>();
           Queue<Integer> index = new LinkedList<>();
          
           char[] carac = linha.toCharArray();
           int tam = carac.length;
          
           for (int i = 0; i < tam; i++) {
               String s = String.valueOf(carac[i]);
               fila.add(s);
               index.add(i);
               set.add(s);
           }

           while (!fila.isEmpty()) {
               String s = fila.remove();
               int n = index.remove();

               for (int i = n + 1; i < tam; i++) {
                   String res = s + String.valueOf(carac[i]);
                  
                   if(set.add(res)) {
                       fila.add(res);
                       index.add(i);
                   }
               }
           }

           for (String s : set) {
               sb.append(s).append("\n");
           }
       }

       System.out.println(sb);
       in.close();
   }
}
