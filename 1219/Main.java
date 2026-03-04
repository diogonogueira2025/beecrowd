import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(
          new InputStreamReader(System.in)
        );
        DecimalFormat df = new DecimalFormat("0.0000");
        StringBuilder sb = new StringBuilder();

        String linha;

        while ((linha = in.readLine()) != null){
            StringTokenizer st = new StringTokenizer(linha, " ");

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());


            double p = (a+b+c)/2.0;
            double areaT = Math.sqrt(p*(p-a)*(p-b)*(p-c));

            double rMaior = (a * b * c) / (4.0 * areaT);
            double areaCircMaior = Math.PI*rMaior*rMaior - areaT;
            
            double raio = areaT/p;
            double areaCircMenor = Math.PI*raio*raio;

            sb.append(df.format(areaCircMaior)).append(" ")
            .append(df.format(areaT - areaCircMenor)).append(" ")
            .append(df.format(areaCircMenor)).append("\n");
        }

        System.out.print(sb);
        in.close();
    }
}