import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        //matriz com os possiveis movimentos do cavalo
        int[][] movs = {
            {-1, -2}, {1, -2},
            {2, -1}, {2, 1},
            {1, 2}, {-1, 2},
            {-2, 1}, {-2, -1}
        };

        int casos = 0;

        String linha = in.readLine().trim();

        while (!linha.equals("0")) {
            //tabuleiro
            boolean[][] tab = new boolean[8][8];

            //coordenada para o cavalo
            char[] cavalo = linha.toCharArray();

            //determinando os indices para o cavalo
            int l = '8' - cavalo[0];
            int c = cavalo[1] - 'a';
            
            //determinando casas validas para o cavalo
            for(int[] mov : movs){
                int ml = mov[0]+l;
                int mc = mov[1]+c;
                if(ml < 8 && ml >= 0 && mc < 8 && mc >= 0){
                    tab[ml][mc] = true;
                }
            }

            //inserindo coordenadas para os peoes
            for (int i = 0; i < 8; i++) {
                String coord = in.readLine().trim();
                int linhaPeao = '8'-coord.charAt(0);
                int colunaPeao = coord.charAt(1)-'a';

                if(linhaPeao + 1 < 8){
                    if(colunaPeao - 1 >= 0){
                        tab[linhaPeao+1][colunaPeao-1] = false;
                    }
                    if(colunaPeao + 1 < 8){
                        tab[linhaPeao+1][colunaPeao+1] = false;
                    }
                }
            }

            int count = 0;

            //contar os movimentos validos
            for(boolean[] vetor : tab){
                for(boolean v : vetor){
                    if(v) count++;
                }
            }

            sb.append(String.format("Caso de Teste #%d: %d movimento(s).", casos+1, count)).append("\n");
            casos++;

            linha = in.readLine().trim();
        }

        System.out.print(sb);

        in.close();
    }
}