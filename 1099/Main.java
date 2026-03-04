import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(
            new InputStreamReader(System.in)  
        );

        StringBuilder sb = new StringBuilder();

        int casos = Integer.parseInt(in.readLine());

        for(int i = 0; i < casos; i++){
            StringTokenizer st = new StringTokenizer(in.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            int max = (a > b) ? a : b;
            int min = (a < b) ? a : b;

            int soma = 0;

            if(min%2 == 0){
                min += 1;
            } else {
                min += 2;
            }

            for(int j = min; j < max; j+= 2){
                soma += j;
            }
            
            sb.append(soma).append("\n");
        }

        System.out.print(sb);
        in.close();
    }
}