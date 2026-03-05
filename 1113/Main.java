import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(
			new InputStreamReader(System.in)
		);

		StringBuilder sb = new StringBuilder();

		String[] linha = in.readLine().split(" ");

		while(!linha[0].equals(linha[1])){
			int x = Integer.parseInt(linha[0]);
			int y = Integer.parseInt(linha[1]);

			sb.append( (x > y) ? "Decrescente" : "Crescente")
			.append("\n");

			linha = in.readLine().split(" ");
		}
		System.out.print(sb);
		in.close();
	}
}