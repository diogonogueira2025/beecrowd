import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(
			new InputStreamReader(System.in)
		);

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < 10; i++) {
			int x = Integer.parseInt(in.readLine());

			if (x <= 0) sb.append("X[").append(i).append("] = 1\n");
			else sb.append("X[").append(i).append("] = ").append(x).append("\n");
		}
		System.out.print(sb);
		in.close();
	}
}