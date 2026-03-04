import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(
          new InputStreamReader(System.in)
        );

        int qnt = Integer.parseInt(in.readLine());

        System.out.println("Ho ".repeat(qnt-1) + "Ho!");
        in.close();
    }
}