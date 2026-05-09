import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Set;
import java.util.TreeSet;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(
            new InputStreamReader(System.in)
        );

        StringBuilder sb = new StringBuilder();

        String linha;

        while ((linha = in.readLine()) != null) {
            int size = linha.length();

            LinkedList<Subsequence> queue = new LinkedList<>();
            Set<String> set = new TreeSet<>();

            for (int i = 0; i < size; i++) {
                Subsequence sub = new Subsequence(linha.substring(i, i+1), i);

                queue.add(sub);
                set.add(sub.s);
            }

            while (!queue.isEmpty()) {
                Subsequence sub  = queue.remove();

                int lastIndex = sub.lastIndex;
                String s = sub.s;

                for (int i = lastIndex + 1; i < size; i++) {
                    String newS = s + linha.charAt(i);
                    if (set.add(newS)) {
                        queue.add(new Subsequence(newS, i));
                    }
                }
            }

            for (String s : set) {
                sb.append(s).append("\n");
            }
            sb.append("\n");
        }
        System.out.print(sb);
        in.close();
    }
}

class Subsequence {
    String s;
    int lastIndex;

    public Subsequence(String s, int lastIndex) {
        this.s = s;
        this.lastIndex = lastIndex;
    }
}
