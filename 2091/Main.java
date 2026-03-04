import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(
			new InputStreamReader(System.in)
		);
		Set<Long> set = new HashSet<>();

		StringBuilder sb = new StringBuilder();
		
		long v = Long.parseLong(in.readLine());
		
		while(v != 0){
			StringTokenizer st = new StringTokenizer(in.readLine(), " ");
			
			for(long i = 0; i < v; i++){
				long n = Long.parseLong(st.nextToken());
				if(!set.add(n)){
					set.remove(n);
				}
			}
			
			if(!set.isEmpty()){
				sb.append(set.iterator().next()).append("\n");
			}

			v = Integer.parseInt(in.readLine());

			set.clear();
		}

		System.out.print(sb);
		in.close();
	}
}