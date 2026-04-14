import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(
			new InputStreamReader(System.in)
		);

		StringBuilder sb = new StringBuilder();

		String linha = in.readLine();
		
		int maior = 0;
		String maiorPalavra = "";

		while (!linha.equals("0")) {
			StringTokenizer st = new StringTokenizer(linha, " ");
			
			boolean primeiro = true;

			while (st.hasMoreElements()) {
				if(!primeiro) sb.append("-");
				primeiro = false;

				String s = st.nextToken();
				int tam = s.length();
				
				sb.append(tam);

				if (tam > maior) {
					maiorPalavra = s;
					maior = tam;
				} else if (tam == maior) {
					if (s.compareTo(maiorPalavra) < 0) {
						maiorPalavra = s;
					}
				}
			}

			sb.append("\n");

			linha = in.readLine();
		}
		
		sb.append("\nThe biggest word: ").append(maiorPalavra).append("\n");
		
		System.out.print(sb);
		in.close();
	}
}