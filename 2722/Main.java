import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(
          new InputStreamReader(System.in)
        );

        StringBuilder sb = new StringBuilder();

        int casos = Integer.parseInt(in.readLine());

        for (int t = 0; t < casos; t++) {
            StringBuilder name = new StringBuilder();

            String s1 = in.readLine();
            String s2 = in.readLine();
            
            int tam1 = s1.length();
            int tam2 = s2.length();
            int i = 0;
            int j = 0;

            while (i < tam1 || j < tam2) {
                if (i + 2 <= tam1) {
                    name.append(s1.substring(i, i+2));
                    i+=2;
                } else if (i < tam1){
                    name.append(s1.charAt(i++));
                }

                if (j + 2 <= tam2) {
                    name.append(s2.substring(j, j+2));
                    j += 2;
                } else if (j < tam2){
                    name.append(s2.charAt(j++));
                }
            }

            sb.append(name).append("\n");
        }

        System.out.print(sb);
        in.close();
    }
}