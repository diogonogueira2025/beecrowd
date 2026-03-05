import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Map<Integer, Integer> map = new HashMap<>();

        String linha = in.readLine().trim();
        int cidades = 1;
        boolean primeiro = true;

        while(!linha.equals("0")){
            if(!primeiro){
                sb.append("\n");
            }
            primeiro = false;
            int casos = Integer.parseInt(linha);

            double consumoMedio = 0;
            int pessoas = 0;

            for(int i = 0; i < casos; i++){
                String[] valores = in.readLine().split(" ");
                int moradores = Integer.parseInt(valores[0]);
                int consumo = Integer.parseInt(valores[1]);
                int cPorM = consumo/moradores;
                map.put(cPorM, map.getOrDefault(cPorM,0)+moradores);
                pessoas += moradores;
                consumoMedio += consumo;
            }
            List<Integer> c = new ArrayList<>(map.keySet());
            Collections.sort(c);

            sb.append("Cidade# "+(cidades)+":\n");

            int i = 0;
            
            while(!map.isEmpty()){
                int cons = c.get(i);
                sb.append(map.remove(cons) + "-" + cons);
                if(map.size() > 0) sb.append(" ");
                i++;
            }
            sb.append("\n");
            consumoMedio = Math.floor((consumoMedio/pessoas)*100)/100.0;
            sb.append(String.format("Consumo medio: %.02f m3.\n", consumoMedio));
            cidades++;
            linha = in.readLine();
        }

        System.out.print(sb);
        in.close();

    }
}
