import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(
          new InputStreamReader(System.in)
        );
        
        String linha;

        while((linha = in.readLine()) != null){
            if (linha.equals("0")) break;

			Set<Long> set = new HashSet<>();

            int casos = Integer.parseInt(linha);
            StringTokenizer st = new StringTokenizer(in.readLine(), " ");

            for(int i = 0; i < casos; i++){
               long v = Long.parseLong(st.nextToken());

               if (!set.add(v)) {
    			   set.remove(v);
			   }
            }
			int count = 0;
			long n1 = 0;
			long n2 = 0;

			for(Long v : set){
				if(count == 0){
					n1 = v;
				} else {
					n2 = v;
				}
				count++;
			}

			if(n1 >= n2){
				System.out.println(n2 + " " + n1);
			} else {
				System.out.println(n1 + " " + n2);
			}
        }

        in.close();
    }
}