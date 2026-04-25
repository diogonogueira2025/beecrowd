import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(
            new InputStreamReader(System.in)
        );
        
        String linha = in.readLine();
        int col = linha.length();
        
        int[] cod = new int[col];
        
        for (int i = 0; i < col; i++) {
            cod[i] = linha.charAt(i) - '0';
        }
        
        
        for (int i = 1; i < 4; i++) {
            String linhaAux = in.readLine();
            
            for (int j = 0; j < col; j++) {
                int v = linhaAux.charAt(j) - '0';
                cod[j] = cod[j]*10 + v;    
            }
        }

        int first = cod[0];
        int last = cod[col-1]; 
        
        StringBuilder sb = new StringBuilder();
        
        for (int i = 1; i < col - 1; i++) {
            int c = (first*cod[i] + last)%257;
            
            sb.append((char)c);
        }
        
        System.out.println(sb);
        in.close();
    }
}