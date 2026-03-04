import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(
          new InputStreamReader(System.in)
        );

        StringBuilder sb = new StringBuilder();

        String s;
        String sp = " ";

        while((s = in.readLine()) != null){
            int tam = s.length();
            
            for(int i = 0; i < tam; i++){
                sb.append(sp.repeat(i));

                String sub = s.substring(0, tam-i);
                boolean primeiro = true;

                for(char c : sub.toCharArray()){
                    if(!primeiro){
                        sb.append(" ");
                    }
                    primeiro = false;
                    sb.append(c);
                }
                sb.append("\n");    
            }
            sb.append("\n");
        }

        System.out.print(sb);
        in.close();
    }
}