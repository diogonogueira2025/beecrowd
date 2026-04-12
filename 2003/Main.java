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

		int max = 480;

		String linha;

		while ((linha = in.readLine()) != null) {
			StringTokenizer st = new StringTokenizer(linha, ":");
			
			int hora = Integer.parseInt(st.nextToken())*60;
			int min = Integer.parseInt(st.nextToken());

			int atraso = hora + min + 60 - max;
			sb.append("Atraso maximo: ");

			if (atraso < 0) {
				sb.append("0\n");
			} else {
				sb.append(atraso).append("\n");
			}
		}
		
		System.out.print(sb);
		in.close();
	}
}