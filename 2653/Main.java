import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(
          new InputStreamReader(System.in)
        );

        Set<String> set = new HashSet<>();

        String linha;

        while ((linha = in.readLine()) != null) {
            set.add(linha);
        }

        System.out.println(set.size());
        in.close();
    }
}