import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(
          new InputStreamReader(System.in)
        );

        StringBuilder sb = new StringBuilder();

        String[] linha = in.readLine().split(" ");

        int v = Integer.parseInt(linha[0]);
        int n = Integer.parseInt(linha[1]);
        
        int total = n*v;

        for(int i = 1; i <= 9; i++){
            sb.append((int) Math.ceil((total*i)/10.0));

            if(i < 9){
                sb.append(" ");
            }
        }
        sb.append("\n");
        System.out.print(sb);
        in.close();
    }
}