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

		String linha;

		while ((linha = in.readLine()) != null) {
			int casos = Integer.parseInt(linha);
			
			for (int i = 0; i < casos; i++) {
				String[] codigo = in.readLine().split(" ");

				int a = codigo[0].length();
				int b = (codigo.length - 1) * 3;
				char c = (char) (a+b+'a'-1);
				sb.append(c).append("\n");
			}
		}

		System.out.print(sb);
		in.close();
	}
}