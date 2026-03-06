import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(
          new InputStreamReader(System.in)
        );

        String s = "LIFE IS NOT A PROBLEM TO BE SOLVED";

        int n = Integer.parseInt(in.readLine());

        System.out.println(s.substring(0, n));
        in.close();
    }
}