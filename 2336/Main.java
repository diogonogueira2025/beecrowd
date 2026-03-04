import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(
          new InputStreamReader(System.in)
        );

        StringBuilder sb = new StringBuilder();

        String linha;

        while((linha = in.readLine()) != null){
            char[] letras = linha.trim().toCharArray();

            long sum = 0;
            
            for(char c : letras){
                sum = (sum*26 + (c - 'A'))%1_000_000_007L;                
            }

            sb.append(sum).append("\n");
        }

        System.out.print(sb);
        in.close();
    }
}