import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(
			new InputStreamReader(System.in)
		);

		int idade = Integer.parseInt(in.readLine());
		double soma = 0;
		int qnt = 0;

		while (idade >= 0) {
			soma += idade;
			qnt++;

			idade = Integer.parseInt(in.readLine());
		}

		System.out.printf("%.2f%n", soma/qnt);
		in.close();
	}
}