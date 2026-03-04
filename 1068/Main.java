import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(
          new InputStreamReader(System.in)
        );

        StringBuilder sb = new StringBuilder();

        String linha;

        while((linha = in.readLine()) != null){
            char[] caracteres = linha.toCharArray();
            int count = 0;
            boolean correct = true;

            for(char c : caracteres){
                
                if(c == '('){
                    count++;
                } else if(c == ')'){
                    if(count > 0){
                        count--;
                    } else {
                        correct = false;
                        break;
                    }
                }
            }

            if(correct && (count == 0)){
                sb.append("correct").append("\n");
            } else {
                sb.append("incorrect").append("\n");
            }
        }

        System.out.print(sb);
        in.close();
    }
}