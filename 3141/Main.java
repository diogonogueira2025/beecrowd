import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(
			new InputStreamReader(System.in)
		);

		StringBuilder sb = new StringBuilder();
		
		String nome = in.readLine().trim();

		String[] dataAtual = in.readLine().split("/");
		String[] dataNasc = in.readLine().split("/");

		int diaAtual = Integer.parseInt(dataAtual[0]);
		int mesAtual = Integer.parseInt(dataAtual[1]);
		int anoAtual = Integer.parseInt(dataAtual[2]);

		int diaNasc = Integer.parseInt(dataNasc[0]);
		int mesNasc = Integer.parseInt(dataNasc[1]);
		int anoNasc = Integer.parseInt(dataNasc[2]);

		int idade = anoAtual - anoNasc;

		if(mesAtual == mesNasc){
			if(diaAtual == diaNasc){
				sb.append("Feliz aniversario!\n");
			} else if (diaAtual < diaNasc){
				idade--;
			}
		} else if (mesAtual < mesNasc){
			idade--;
		}

		sb.append("Voce tem ").append(idade).append(" anos ").append(nome).append(".\n");

		System.out.print(sb);
		in.close();
	}
}