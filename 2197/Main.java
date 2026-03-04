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

        int n = Integer.parseInt(in.readLine());

        StringTokenizer st = new StringTokenizer(in.readLine());

        int ant = 0;
        int index = 0;

        for(int i = 0; i < n; i++){
            int num = Integer.parseInt(st.nextToken());

            if(num < ant){
                index = i + 1;
                break;
            }

            ant = num;
        }

        System.out.println(index);
        in.close();
    }
}