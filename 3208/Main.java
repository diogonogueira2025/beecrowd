import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(
			new InputStreamReader(System.in)
		);

		StringBuilder sb = new StringBuilder();

        String[] linha = in.readLine().split(" ");

        while (!linha[0].equals("0") || !linha[1].equals("0")){
            BigInteger k = new BigInteger(linha[0]);
            int l = Integer.parseInt(linha[1]);

            boolean[] primos = new boolean[l+1];
            crivo(primos, l);

            int primo = 0;

            for (int i = 2; i < l; i++){
                if(primos[i]){
                    if(k.mod(BigInteger.valueOf(i)).equals(BigInteger.ZERO)){
                        primo = i;
                        break;
                    }
                }
            }

            if (primo != 0) {
                sb.append("BAD ").append(primo).append("\n");
            } else {
                sb.append("GOOD\n");
            }

            linha = in.readLine().split(" ");
        }
        System.out.print(sb);
		in.close();
	}

    public static void crivo(boolean[] primos, int tam){
        for (int i = 2; i <= tam; i++){
            primos[i] = true;
        }

        for (int i = 2; i * i <= tam; i++){
            if (primos[i]){
                for (int j = i*i; j <= tam; j+=i){
                    primos[j] = false;
                }
            }
        }
    }
}