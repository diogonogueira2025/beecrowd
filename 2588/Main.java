//A ideia é que, para existir alguma permutação que forme um palíndromo, no máximo um caractere pode possuir frequência ímpar. 
// Isso acontece porque, em um palíndromo, os caracteres são distribuídos de forma simétrica, formando pares nas extremidades. 
// Caso exista mais de um caractere com quantidade ímpar, é necessário adicionar letras para transformar essas frequências em pares, 
// restando apenas uma frequência ímpar possível para o centro do palíndromo.

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

        while ((linha = in.readLine()) != null) {
            int[] letras = new int[26];
            int tam = linha.length();
            
            for (int i = 0; i < tam; i++) {
                letras[linha.charAt(i) - 'a']++;
            }

            int impar = 0;
            
            for (int v : letras) {
                if ((v&1) == 1) {
                    impar++;
                }
            }

            if (impar > 1) sb.append(impar-1);
            else sb.append("0");

            sb.append("\n");
        }
        
        System.out.print(sb);
        in.close();
    }
}
