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
            linha = linha.replace("-", "");
            int baseMin = pegarBaseMin(linha);

            int baseDiv = pegarBaseDiv(linha, baseMin);

            if (baseDiv != -1) {
                sb.append(baseDiv).append("\n");
            } else {
                sb.append("such number is impossible!\n");
            }
        }

        System.out.print(sb);
        in.close();
    }

    public static int converterChar(char c) {
        int aux = 0;

        if (c >= '0' && c <= '9') {
            aux = c - '0';
        } else if (c >= 'A' && c <= 'Z') {
            aux = c - 'A' + 10;
        } else if (c >= 'a' && c <= 'z') {
            aux = c - 'a' + 36;
        }
        return aux;
    }

    public static int pegarBaseMin(String num) {
        int baseMin = 2;

        for (int i = 0; i < num.length(); i++) {
            char c = num.charAt(i);

            int aux = converterChar(c);

            if (aux + 1 > baseMin) baseMin = aux + 1;
        }

        return baseMin;
    }

    public static int pegarBaseDiv(String num, int baseMin) {
        for (int i = baseMin; i < 63; i++) {
            int resto = 0;

            for (int j = 0; j < num.length(); j++) {
                char c = num.charAt(j);
                int aux = converterChar(c);

                resto = (resto*i + aux)%(i-1);
            }

            if (resto == 0) {
                return i;
            }
        }
        return -1;
    }
}
