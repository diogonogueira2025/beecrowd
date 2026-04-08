import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(
          new InputStreamReader(System.in)
        );

        StringBuilder sb = new StringBuilder();

        char[] n = in.readLine().toCharArray();
        int m = Integer.parseInt(in.readLine());

        int[] nums = new int[m];

        for (int i = 0; i < m; i++) {
            nums[i] = Integer.parseInt(in.readLine());
        }

        Arrays.sort(nums);

        Set<Integer> deu = new HashSet<>();
        Set<Integer> naoDeu = new HashSet<>();

        boolean primeiro = true;

        for (int v : nums) {
            if (deu.contains(v)) {
                if (!primeiro) sb.append(" ");
                primeiro = false;
                sb.append(v);
            } else if(naoDeu.contains(v)) {
                continue;
            } else {
                int resto = 0;

                for (int i = 0; i < n.length; i++) {
                    resto = (resto*2 + (n[i]-'0'))%v;
                }

                if (resto == 0) {
                    if (!primeiro) sb.append(" ");
                    primeiro = false;
                    sb.append(v);
                    deu.add(v);
                } else {
                    naoDeu.add(v);
                }
            }
        }

        if (sb.length() == 0) sb.append("Nenhum");

        System.out.println(sb);
        in.close();
    }
}