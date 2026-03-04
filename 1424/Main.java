import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main 
{
    public static void main(String[] args) throws IOException 
    {
        BufferedReader in = new BufferedReader(
            new InputStreamReader(System.in)
        );

        StringBuilder sb = new StringBuilder();

        String linha;
        Map<Integer, ArrayList<Integer>> map = new HashMap<>();
        
        while((linha = in.readLine()) != null)
        {
            StringTokenizer st = new StringTokenizer(linha, " ");
            int n = Integer.parseInt(st.nextToken()); //elementos
            int m = Integer.parseInt(st.nextToken()); //consultas
            
            StringTokenizer vetor = new StringTokenizer(in.readLine(), " ");

            for(int i = 0; i < n; i++)
            {
                int num = Integer.parseInt(vetor.nextToken());
                ArrayList<Integer> list = map.getOrDefault(num, new ArrayList<>());
                list.add(i+1);
                
                map.put(num, list);
            }

            for(int i = 0; i < m; i++)
            {
                String[] partes = in.readLine().split(" ");
                int index = Integer.parseInt(partes[0]);
                int value = Integer.parseInt(partes[1]);

                ArrayList<Integer> list = map.get(value);
                
                if(list != null)
                {
                    if(index <= list.size())
                    {
                        sb.append(list.get(index - 1)).append("\n");
                        continue;
                    }
                }

                sb.append("0\n");
            }
            map.clear();
        }

        System.out.print(sb);
        in.close();
    }
}