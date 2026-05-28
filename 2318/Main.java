import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(
            new InputStreamReader(System.in)
        );  
        int[][] check = new int[][] {
            {},
            {},
            {},
            {}
        }
        int[][] matriz = new int[3][3];
        ArrayList<int[][]> list = new ArrayList<>();
        
        for (int i = 0; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(in.readLine(), " ");
            for (int j = 0; j < 3; j++) {
                int value = Integer.parseInt(st.nextToken());
                matriz[i][j] = value;

                if (value == 0) list.add(new int[][]{i, j});
            }
        }
        
        for (int[][] indices : list) {
            
        }
        in.close();
    }
}
