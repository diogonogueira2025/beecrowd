import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main 
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader in = new BufferedReader(
          new InputStreamReader(System.in)
        );

        StringBuilder sb = new StringBuilder();

        String linha;

        while((linha = in.readLine()) != null) 
        {
            int casos = Integer.parseInt(linha);

            for(int i = 0; i < casos; i++)
            {
                char[] carac = in.readLine().toCharArray();

                int m = Integer.parseInt(in.readLine());

                for(int j = 0; j < carac.length; j++)
                {
                    carac[j] -= m;

                    if(carac[j] < 'A')
                    {
                        carac[j] += 26;
                    }
                }
                
                sb.append(String.valueOf(carac)).append("\n");
            }
        }

        System.out.print(sb);
        in.close();
    }
}