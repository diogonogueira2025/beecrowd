import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(
          new InputStreamReader(System.in)
        );

        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(in.readLine(), " ");

        int a = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        while (n <= 0) {
            n = Integer.parseInt(st.nextToken());
        }

        System.out.println(a*n + ((n-1)*n)/2);
        in.close();
    }
}