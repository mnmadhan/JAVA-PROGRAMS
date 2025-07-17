import java.util.*;

class Pair {
    int f;
    int s;

    Pair(int fi, int se) {
        f = fi;
        s = se;
    }

    public String toString() {
        return "(" + f + "," + s + ")";
    }
}

public class timeintervals {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();  
        List<Pair> pairs = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            pairs.add(new Pair(a, b));
        }

        pairs.sort((p1, p2) -> Integer.compare(p1.f, p2.f));

        List<Pair> merged = new ArrayList<>();
        Pair current = pairs.get(0);

        for (int i = 1; i < n; i++) {
            Pair next = pairs.get(i);
            if (current.s >= next.f) {
                
                current.s = Math.max(current.s, next.s);
            } else {
                merged.add(current);
                current = next;
            }
        }
        merged.add(current);

        for (Pair p : merged) {
            System.out.print(p + " ");
        }
    }
}
