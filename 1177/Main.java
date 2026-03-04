import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(
			new InputStreamReader(System.in)
		);

		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(in.readLine());

		int count = 0;

		for(int i = 0; i < 1000; i++){
			if(count == t){
				count = 0;
			}
			sb.append("N[").append(i).append("] ").append("= ").append(count).append("\n");
			
			count++;
		}
		System.out.print(sb);
		in.close();
	}
}