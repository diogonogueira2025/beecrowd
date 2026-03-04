import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        int[] gasolina = new int[3];

        int v = Integer.parseInt(in.readLine());

        while(v != 4){
            if(v < 4){
                gasolina[v-1]++;
            }
            v = Integer.parseInt(in.readLine());
        }

        out.println("MUITO OBRIGADO");
        out.println("Alcool: " + gasolina[0]);
        out.println("Gasolina: " + gasolina[1]);
        out.println("Diesel: " + gasolina[2]);

        out.close();
        in.close();
    }
}