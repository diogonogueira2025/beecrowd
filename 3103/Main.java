import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(
          new InputStreamReader(System.in)
        );

        StringBuilder sb = new StringBuilder();

        int casos = Integer.parseInt(in.readLine());

        for (int i = 0; i < casos; i++) {
            char[] nums = in.readLine().toCharArray();

            Arrays.sort(nums);

            if (nums[0] == '0') {
                for (int a = 0; a < nums.length; a++) {
                    if (nums[a] > '0') {
                        nums[0] = nums[a];
                        nums[a] = '0';
                        break;
                    }
                }
            }
            
            for (char v : nums) {
                sb.append(v);
            }
            
            sb.append("\n");
        }

        System.out.print(sb);
        in.close();
    }
}