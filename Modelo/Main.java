/*
> Usar StringTokenizer para substituir o split(" "):
    StringTokenizer st = new StringTokenizer(in.readLine(), " ");
    long v = Long.parseLong(st.nextToken());

> Usar o DecimalFormat para formatacao de Decimal:
    DecimalFormat df = new DecimalFormat("0.000");

> Não usar o fila.poll() para remover, usar o fila.remove()
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(
          new InputStreamReader(System.in)
        );

        StringBuilder sb = new StringBuilder();

        in.close();
    }
}