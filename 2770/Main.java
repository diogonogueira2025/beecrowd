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
            String[] valores = linha.split(" ");
            int x = Integer.parseInt(valores[0]);
            int y = Integer.parseInt(valores[1]);
            int m = Integer.parseInt(valores[2]);

            for(int i = 0; i < m; i++){
                String[] linha2 = in.readLine().split(" ");
                int xi = Integer.parseInt(linha2[0]);
                int yi = Integer.parseInt(linha2[1]);
                
                if(xi <= x && yi <= y){
                    sb.append("Sim\n");
                } else if (xi <= y && yi <= x){
                    sb.append("Sim\n");
                } else {
                    sb.append("Nao\n");
                }
            }
        }

        System.out.print(sb);
        in.close();
    }
}