import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.HashMap;
import java.util.StringTokenizer;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(
          new InputStreamReader(System.in)
        );
        StringBuilder sb = new StringBuilder();
        
        String firstLine = in.readLine();

        if (firstLine == null) { 
            System.out.print(sb); 
            in.close(); 
            return; 
        }

        int n = Integer.parseInt(firstLine.trim());
        
        while (n != 0) {
            Map<String, String> map = new HashMap<>();

            for (int i = 0; i < n; i++) {
                String line = in.readLine();
                if (line == null) break;
                
                StringTokenizer st = new StringTokenizer(line, " ");
                    
                String s1 = st.nextToken();
                String s2 = st.nextToken();
                map.put(s1, s2);
            }

            String mLine = in.readLine();
            if (mLine == null) break;
            int m = Integer.parseInt(mLine.trim());

            int count = 0;

            for (int i = 0; i < m; i++) {
                String line = in.readLine();
                if (line == null) break;
                StringTokenizer st = new StringTokenizer(line.trim(), " ");
                
                String s1 = st.nextToken();
                String s2 = st.nextToken();

                if (!map.containsKey(s1)){
                    count++;
                } else if (!compareTo(map.get(s1), s2)){
                    count++;
                } 
            }
            sb.append(count).append("\n");

            String line = in.readLine();
            if (line == null) break;
            n = Integer.parseInt(line.trim());
        }
        System.out.print(sb);
        in.close();
    }
    public static boolean compareTo(String s1, String s2) {
        int tam1 = s1.length();
        int tam2 = s2.length();
        int index1 = 0;
        int index2 = 0;
        int count = abs(tam1-tam2);

        while (index1 < tam1 && index2 < tam2 && count < 2) {
            if(s1.charAt(index1++) != s2.charAt(index2++)) {
                count++;
            }
        }
        return count < 2;
    }
    public static int abs(int x) {
        return (x >= 0) ? x : -x;
    }
}