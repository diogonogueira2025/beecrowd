import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(
          new InputStreamReader(System.in)
        );

        StringBuilder sb = new StringBuilder();

        String d1 = in.readLine();
        String h1 = in.readLine();

        String d2 = in.readLine();
        String h2 = in.readLine();

        int time1 = getTime(d1, h1);
        int time2 = getTime(d2, h2);

        int time = time2 - time1;

        int dia = time/86400;
        time = time%86400;

        int hora = time/3600;
        time = time%3600;

        int min = time/60;
        time = time%60;

        int s = time;

        sb.append(dia).append(" dia(s)\n")
        .append(hora).append(" hora(s)\n")
        .append(min).append(" minuto(s)\n")
        .append(s).append(" segundo(s)\n");

        System.out.print(sb);
        in.close();
    }
    
    public static int getTime(String d, String h){
        int aux = 0;

        //dia
        String[] dia = d.split(" ");
        aux += Integer.parseInt(dia[1])*86400;

        String[] horas = h.split(" : ");

        //hora
        aux += Integer.parseInt(horas[0])*3600;

        //minutos
        aux += Integer.parseInt(horas[1])*60;

        //segundos
        aux += Integer.parseInt(horas[2]);

        return aux;
    }
}