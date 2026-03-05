import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(
          new InputStreamReader(System.in)
        );

        int a = Integer.parseInt(in.readLine());
        int b = Integer.parseInt(in.readLine());

        int maior = a;
        int menor = b;

        if(b > a) {
            maior = b;
            menor = a;
        }

        int sum = 0;

        for(int i = menor; i <= maior; i++){
            if(i%13 != 0) {
                sum += i;
            }
        }

        System.out.println(sum);
        in.close();
    }
}