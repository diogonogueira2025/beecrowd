import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(
			new InputStreamReader(System.in)
		);

		StringBuilder sb = new StringBuilder();

		String linha;

		while ((linha = in.readLine()) != null) {
			String linha2 = in.readLine();

			if (linha.length() < linha2.length()) {
				sb.append("Nao resistente\n");
				continue;
			}

			char[] d = linha.toCharArray();
			char[] s = linha2.toCharArray();

			int tamD = d.length;
			int tamS = s.length;

			int count = 0;

			for (int i = 0; i < tamD; i++) {
				if(d[i] == s[0]) {
					count = 1;

					for (int j = 1; j < tamS && i+j < tamD; j++) {
						if(d[i+j] != s[j]) {
							break;
						}
						count++;
					}

					if(count == tamS) {
						sb.append("Resistente\n");
						break;
					}
				}
			}

			if (count < tamS) {
				sb.append("Nao resistente\n");
			}
		}

		System.out.print(sb);
		in.close();
	}
}