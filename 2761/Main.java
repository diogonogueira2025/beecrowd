import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class Main {

    public static void main(String[] args) throws IOException {

        Locale.setDefault(Locale.US);
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        String linha;

        while ((linha = in.readLine()) != null) {

            String[] partes = linha.split(" ", 4);

            int a = Integer.parseInt(partes[0]);
            float b = Float.parseFloat(partes[1]);
            char c = partes[2].charAt(0);
            
            String frase = partes[3];
            
            // linha 1
            System.out.printf("%d%.6f%c%s\n", a, b, c, frase);

            // linha 2 (TAB real)
            System.out.printf("%d\t%.6f\t%c\t%s\n", a, b, c, frase);

            // linha 3 (campos de 10 caracteres)
            System.out.printf("%10d%10.6f%10c%10s\n", a, b, c, frase);
        }

        in.close();
    }
}