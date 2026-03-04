import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(
            new InputStreamReader(System.in)
        );
        
        double soma = 0;
        int count = 0;
        String c = in.readLine();

        for(int i = 0; i < 12; i++){
            for(int j = 0; j < 12; j++){
                double v = Double.parseDouble(in.readLine());
                if(j > i && j > 11 - i){
                    soma += v;
                    count++;
                }
            }
        }

        if(c.equals("S")){
            System.out.printf("%.1f%n", soma);
        } else {
            System.out.printf("%.1f%n", soma/count);
        }

        in.close();
    }
}