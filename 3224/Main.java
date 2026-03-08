import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(
          new InputStreamReader(System.in)
        );

        StringBuilder sb = new StringBuilder();

        String jonAh = in.readLine();
        String medAh = in.readLine();

        if (jonAh.length() >= medAh.length()) {
            System.out.println("go");
        } else {
            System.out.println("no");
        }
        
        in.close();
    }
}