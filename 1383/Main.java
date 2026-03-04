import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(
          new InputStreamReader(System.in)
        );

        StringBuilder sb = new StringBuilder();

        int casos = Integer.parseInt(in.readLine());

        boolean primeiro = true;

        for(int i = 0; i < casos; i++){
            if(!primeiro){
                sb.append("\n");
            }
            primeiro = false;

            int[][] sudoku = new int[9][9];

            for(int l = 0; l < 9; l++){
                String[] linha = in.readLine().split(" ");
                for(int c = 0; c < 9; c++){ 
                    sudoku[l][c] = Integer.parseInt(linha[c]);
                }
            }
            sb.append("Instancia ").append(i+1).append("\n");

            if(validarColuna(sudoku) && validarLinha(sudoku) && validarSquare(sudoku)){
                sb.append("SIM\n");
            } else {
                sb.append("NAO\n");
            }

        }
        sb.append("\n");
        
        System.out.print(sb);
        in.close();
    }
    public static boolean validarLinha(int[][] sudoku){
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                int v = sudoku[i][j];
                if(!set.add(v)){
                    return false;
                }
            }
            set.clear();
        }
        return true;
    }

    public static boolean validarColuna(int[][] sudoku){
        Set<Integer> set = new HashSet<>();

        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                if(!set.add(sudoku[j][i])){
                    return false;
                }
            }
            set.clear();
        }

        return true;
    }

    public static boolean validarSquare(int[][] sudoku){
        Set<Integer> set = new HashSet<>();
        
        int c = 0;
        int count = 0;

        for(int n = 0; n < 3; n++){
            for(int i = 0; i < 9; i++){
                for(int j = 0 + c; j < c+3; j++){
                    if(!set.add(sudoku[i][j])){
                        return false;
                    } 
                    count++;
                }
                if(count == 9){
                    count = 0;
                    set.clear();
                }
            }
            c += 3;
            
        }

        return true;
    }
}
