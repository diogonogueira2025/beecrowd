import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static Queue<Integer> fila = new LinkedList<>();
    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(
          new InputStreamReader(System.in)
        );

        StringBuilder sb = new StringBuilder();

        int casos = Integer.parseInt(in.readLine());

        for(int e = 0; e < casos; e++){
            int qnt = Integer.parseInt(in.readLine());

            StringTokenizer st = new StringTokenizer(in.readLine(), " ");

            Node node = new Node(Integer.parseInt(st.nextToken()));
            
            for(int i = 1; i < qnt; i++){
                Node aux = node;
                int v = Integer.parseInt(st.nextToken());
                
                while(aux != null){
                    if(v < aux.valor){
                        if(aux.esquerda != null){
                            aux = aux.esquerda;
                        } else {
                            aux.esquerda = new Node(v);
                            break;
                        }
                        
                    } else {
                        if(aux.direita != null){
                            aux = aux.direita;
                        } else {
                            aux.direita = new Node(v);
                            break;
                        }
                    }
                }  
            }
            sb.append("Case ").append(e+1).append(":\n");

            elementos(node);
            while(!fila.isEmpty()){
                sb.append(fila.remove()).append(" ");
            }

            sb.deleteCharAt(sb.length()-1);

            sb.append("\n\n");

            fila.clear();
        }
        System.out.print(sb);
        in.close();
    }

    public static class Node {
        int valor;
        Node esquerda, direita;

        public Node(int valor){
            this.valor = valor;
            this.esquerda = null;
            this.direita = null;
        }
    }
    public static void elementos(Node node){
        Queue<Node> nodes = new LinkedList<>();

        nodes.add(node);

        while(!nodes.isEmpty()){
            Node n = nodes.remove();
            fila.add(n.valor);
            
            if(n.esquerda != null) nodes.add(n.esquerda);
            if(n.direita != null) nodes.add(n.direita);
        }
    }
}