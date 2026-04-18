import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(
			new InputStreamReader(System.in)
		);	

		String x = in.readLine();
		int tamX = x.length();

		int k = Integer.parseInt(in.readLine());

		int index = 0;
		int menorEdicao = 100_001;

		for (int t = 0; t < 5; t++) {
			String y = in.readLine();

			int tamY = y.length();

			int aux = tamX - tamY;

			int edicao = (aux >= 0) ? aux : 0;

			for (int i = 0; i < tamX && i < tamY; i++) {
				if (x.charAt(i) != y.charAt(i)) edicao++;
			}

			if (edicao < menorEdicao) {
				menorEdicao = edicao;
				index = t + 1;
			} 
		}
		StringBuilder sb = new StringBuilder();

		if (menorEdicao <= k) {
			sb.append(index).append("\n")
			.append(menorEdicao).append("\n");
		} else {
			sb.append("-1\n");
		}

		System.out.print(sb);
		in.close();
	}
}