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
        
        int n = Integer.parseInt(st.nextToken());
        int q = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] monstros = new int[n];

        StringTokenizer st2 = new StringTokenizer(in.readLine(), " ");
        
        for(int i = 0; i < n; i++){
            monstros[i] = Integer.parseInt(st2.nextToken());
        }

        for(int i = 0; i < q; i++){
            StringTokenizer st3 = new StringTokenizer(in.readLine(), " ");
            int op = Integer.parseInt(st3.nextToken());

            int a = Integer.parseInt(st3.nextToken());
            int b = Integer.parseInt(st3.nextToken());

            if(op == 1){
                sb.append(contarTipos(m, monstros, a-1, b-1)).append("\n");
            } else {
                monstros[a-1] = b;
            }
        }
        
        System.out.print(sb);
        in.close();
    }
    public static int contarTipos(int m, int[] monstros, int l, int r){
        boolean[] tipos = new boolean[51];

        int count = 0;

        for(int i = l; i <= r; i++){
            if(!tipos[monstros[i]]){
                tipos[monstros[i]] = true;
                count++;
            }
        }
        return count;
    }
}