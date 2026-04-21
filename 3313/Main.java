import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(
			new InputStreamReader(System.in)
		);
		StringBuilder sb = new StringBuilder();
		String linha = in.readLine();

		int casos = 1;

		while (!linha.equals("*")) {
			char menor = 'z';
			char maior = 'a';

			TreeSet<String> set = new TreeSet<>();
			int tam = linha.length();

			for (int i = 0; i < tam; i++) {
				char c = linha.charAt(i);

				if (c <= menor) {
					menor = c;
				} else if (c >= maior) {
					maior = c;
				} else {
					continue;
				}

				String s = linha.substring(i, tam) + linha.substring(0, i);
				set.add(s);			
			}

			sb.append("Caso ").append(casos).append(": ")
			.append(set.first()).append(" ")
			.append(set.last()).append("\n");

			casos++;
			linha = in.readLine();
		}

		System.out.print(sb);
		in.close();
	}
}