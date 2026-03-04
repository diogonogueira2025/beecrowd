import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        Set<Integer> set = new HashSet<>();
        Queue<int[]> fila = new LinkedList<>();

        StringTokenizer st = new StringTokenizer(in.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        set.add(n);
        fila.add(new int[] {0, n});

        int count = 0;

        while(!fila.isEmpty()){
            int[] nums = fila.remove();
            int indice = nums[0];
            int num = nums[1];

            if(num == m){
                count = indice;
                break;
            }

            if(set.add(num*2)){
                fila.add(new int[]{indice+1, num*2});
            }
            if(set.add(num*3)){
                fila.add(new int[]{indice+1, num*3});
            }
            if(set.add(num/2)){
                fila.add(new int[]{indice+1, num/2});
            }
            if(set.add(num/3)){
                fila.add(new int[]{indice+1, num/3});
            }
            if(set.add(num+7)){
                fila.add(new int[]{indice+1, num+7});
            }
            if(set.add(num-7)){
                fila.add(new int[]{indice+1, num-7});
            }

        }
        System.out.println(count);
        
        in.close();
    }
}