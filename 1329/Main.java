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

        int n = Integer.parseInt(in.readLine());

        while(n != 0){
            StringTokenizer st = new StringTokenizer(in.readLine());
            int mary = 0;

            for(int i = 0; i < n; i++){
                if(st.nextToken().equals("0")) mary++;
            }

            sb.append("Mary won ")
            .append(mary)
            .append(" times and John won ")
            .append(n-mary)
            .append(" times\n");

            n = Integer.parseInt(in.readLine());
        }

        System.out.print(sb);
        in.close();
    }
}