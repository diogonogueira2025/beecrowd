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
            int num = Integer.parseInt(linha);
            int count = 0;
            int sum = 0;
            int numSum = (num*(1+num))/2;

            while(count < num-1){
                String[] linha2 = in.readLine().split(" ");
                int tam = linha2.length;
                
                for(int i = 0; i < tam; i++){
                    sum += Integer.parseInt(linha2[i]);
                }

                count += tam;
            }

            sb.append(numSum - sum).append("\n");
        }
        System.out.print(sb);
        in.close();
    }
}