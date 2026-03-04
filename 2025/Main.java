import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(
          new InputStreamReader(System.in)
        );

        StringBuilder sb = new StringBuilder();

        int casos = Integer.parseInt(in.readLine());
        char[] exe = new char[] {'o', 'u', 'l', 'u', 'p', 'u', 'k', 'k'};

        for(int k = 0; k < casos; k++){
            StringTokenizer st = new StringTokenizer(in.readLine(), " ");
            boolean primeiro = true;

            while(st.hasMoreTokens()){
                if(!primeiro){
                    sb.append(" ");
                }
                primeiro = false;

                String s = st.nextToken();
                int tam = s.length();

                if(tam >= 10){
                    char[] carac = s.toCharArray();
                    boolean teste = true;

                    for(int i = 1; i < 9; i++){
                        if(carac[i] != exe[i-1]){
                            teste = false;
                            break;
                        }
                    }

                    if(teste){
                        sb.append("Joulupukki");
                        if(tam == 11) sb.append(".");
                        continue;
                    }
                }
                sb.append(s);
            }
            sb.append("\n");
        }

        System.out.print(sb);
        in.close();
    }
}