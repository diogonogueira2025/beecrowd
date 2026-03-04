import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(
            new InputStreamReader(System.in)
        );

        StringBuilder sb = new StringBuilder();

        String l = in.readLine();

        while (!l.equals("0")) {
            long tam = l.length();
            sb.append(fatorial(tam)).append("\n");
            l = in.readLine();
        }
        System.out.print(sb);
    }
    public static long fatorial(long num){
        long fat = 1;

        for(int i = 1; i <= num; i++){
            fat *= i;
        }

        return fat;
    }
}
