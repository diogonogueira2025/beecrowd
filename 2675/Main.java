import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        //
        String linha;
        while ((linha = in.readLine()) != null) {
            int n = Integer.parseInt(linha);
            String[] cartas = in.readLine().trim().split(" ");

            Stack<Integer> monte = new Stack<Integer>();

            int count = 0;
            long pont = 0;

            while(count < n){
                int cartaAtual = Integer.parseInt(cartas[count]);

                if(monte.empty() || (monte.peek() < cartaAtual)){
                    monte.push(cartaAtual);
                    count++;
                } else {
                    pont += monte.pop();
                }
            }
            System.out.println(pont);
        }
        
        in.close();
    }
}