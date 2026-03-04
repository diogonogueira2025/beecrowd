//O PIOR PROBLEMA JÁ FEITO NO BEECROWD
//TODO O MEU ÓDIO AO CARA Q CRIOU ESSE PROBLEMA
//SUCUMBA

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(
          new InputStreamReader(System.in)
        );

        StringBuilder sb = new StringBuilder();

        String linha = in.readLine();

        while(!linha.equals("0")){
            int casos = Integer.parseInt(linha);

            for(int i = 0; i < casos; i++){
                char[] nums = in.readLine().toCharArray();
                int pares = 0;
                int impares = 0;

                boolean vezPar = true;

                for(char c : nums){
                    int v = c-'0';
                    if(vezPar){
                        pares += v;
                        
                    } else {
                        impares += v;
                    }
                    vezPar = !vezPar;
                }
                sb.append(somaDig(pares)+somaDig(impares)).append("\n");
            }

            linha = in.readLine();
        }
        System.out.print(sb);
        in.close();
    }
    public static int somaDig(int v){
        int aux = 0;
        while(v > 0){
            aux += v%10;
            v = v/10;
        }
        return aux;
    }
}