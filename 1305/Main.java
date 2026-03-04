import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(
          new InputStreamReader(System.in)
        );

        StringBuilder sb = new StringBuilder();

        String linha;

        while((linha = in.readLine()) != null){
            String linha2 = in.readLine();
            double[] num = convert(linha);
            double[] cutoff = convert(linha2);

            if(num[1] > cutoff[1]){
                sb.append((int) num[0] + 1).append("\n");
            } else {
                sb.append((int) num[0]).append("\n");
            }
        }

        System.out.print(sb);
        in.close();
    }

    public static double[] convert(String s){
        double num = 0.0;
        double dec = 0.0;
        
        boolean ponto = false;
        int count = 0;

        for (char c : s.toCharArray()) {
            if(c == '.'){
                ponto = true;
                continue;
            }

            if(!ponto){
                num = num*10.0 + (double)(c - '0');
                
            } else {
                dec = dec*10.0 + (double)(c - '0');
                count++;
            }
        }
        return new double[] {num, dec/Math.pow(10, count)};
    }
}