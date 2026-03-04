import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(
          new InputStreamReader(System.in)
        );

        PrintWriter out = new PrintWriter(System.out);

        String linha;

        while((linha = in.readLine()) != null){
            double grau = Double.parseDouble(linha);

            double tempo = (240.0*grau + 21600.0)%86400;

            int horas = (int)(tempo/3600);
            int minutos = (int)((tempo%3600)/60);
            int segundos = (int)(tempo%60);
            
            if(horas < 6){
                out.println("De Madrugada!!");
            } else if (horas < 12){
                out.println("Bom Dia!!");
            } else if (horas < 18){
                out.println("Boa Tarde!!");
            } else if (horas < 24){
                out.println("Boa Noite!!");
            }
            out.printf("%02d:%02d:%02d\n", horas, minutos, segundos);
        }
        out.close();
        in.close();
    }
}