import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args)throws IOException{
        BufferedReader in = new BufferedReader(
            new InputStreamReader(System.in)
        );
        
        char[] l1 = in.readLine().trim().toCharArray();
        char[] l2 = in.readLine().trim().toCharArray();

        long cpf = 0L;
        double valor = 0.0;
        int count = 0;
        boolean ponto = false;
        double dec = 10.0;
        int casaDec = 0;

        for(int i = 0; i < l1.length; i++){
            int c = l1[i];
            int v = c -'0';
            if((v > 9 || v < 0) && c != '.') continue;

            if(count < 11 && c != '.'){
                cpf = cpf*10 + v;
                count++;  
            } else {
                if(c == '.'){
                    if(ponto) break;
                    ponto = true;
                    continue;
                } 
                if(!ponto){
                    valor = valor*10.0 + v;
                } else {
                    if(casaDec < 2){
                        valor += (double) v/dec;
                        dec *= 10.0;
                        casaDec++;
                    } 
                    
                }
            }
        }
        ponto = false;
        dec = 10.0;
        double valor2 = 0;
        casaDec = 0;

        for(int i = 0; i < l2.length; i++){
            int c = l2[i];
            int v = c -'0';
            if((v > 9 || v < 0) && c != '.') continue;

            if(c == '.'){
                if(ponto) break;
                ponto = true;
                continue;
            } 
            if(!ponto){
                valor2 = valor2*10.0 + v;
            } else {
                if(casaDec < 2){
                    valor2 += (double) v/dec;
                    dec *= 10.0;
                    casaDec++;
                }
            }
        }

        System.out.printf("cpf %011d%n", cpf);
        System.out.printf("%.2f%n", valor+valor2);
    }
}