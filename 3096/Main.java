import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(
          new InputStreamReader(System.in)
        );

        int n = Integer.parseInt(in.readLine());
        double res = n*Math.log10(n)-n*Math.log10(Math.E)+0.5*Math.log10(2.0*Math.PI*n);
        res = Math.ceil(res);
        System.out.printf("%.0f%n", res);
        
        in.close();
    }
}