import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(
          new InputStreamReader(System.in)
        );

        StringBuilder sb = new StringBuilder();

        String linha;

        while ((linha = in.readLine()) != null){
            if(validarSenha(linha)){
                sb.append("Senha valida.\n");
            } else {
                sb.append("Senha invalida.\n");
            }
        }        
        System.out.print(sb);
        in.close();
    }

    public static boolean validarSenha(String pass){
        int tam = pass.length();

        if(tam > 32 || tam < 6){
            return false;
        }
        
        char[] letras = pass.toCharArray();
        
        boolean min = false;
        boolean max = false;
        boolean num = false;

        for(char c : letras) {
            if(c >= 'a' && c <= 'z'){
                min = true;
                continue;
            }
            if(c >= 'A' && c <= 'Z') {
                max = true;
                continue;
            }

            if(c >= '0' && c <= '9'){
                num = true;
                continue;
            }

            return false;
        }
        return min&&max&&num;
    }
}