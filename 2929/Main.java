import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(
          new InputStreamReader(System.in)
        );

        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();
        PriorityQueue<Integer> fila = new PriorityQueue<>();

        int casos = Integer.parseInt(in.readLine());

        for(int i = 0; i < casos; i++){
            String[] linha = in.readLine().split(" ");
            String op = linha[0];
            int num = 0;
            if(op.equals("PUSH")){
                num = Integer.parseInt(linha[1]);
            }
            
            switch (op) {
                case "PUSH":
                    stack.push(num);
                    fila.add(num);
                    break;
                case "MIN":
                    if(!fila.isEmpty()){
                        sb.append(fila.peek()).append("\n");
                    } else {
                        sb.append("EMPTY").append("\n");
                    }
                    break;
                case "POP":
                    if(!stack.isEmpty()){
                        fila.remove(stack.pop());
                    } else {
                        sb.append("EMPTY").append("\n");
                    }
                default:
                    break;
            }
        }
        
        System.out.print(sb);
        in.close();
    }
}
