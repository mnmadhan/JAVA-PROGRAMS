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

public class pairs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scan.nextInt();
        }
        int ch = scan.nextInt();
        List<Pair> pairList = new ArrayList<>();
        List<Pair> origi = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (arr[i] + arr[j] == ch) {
                    pairList.add(new Pair(i, j)); 
                    origi.add(new Pair(arr[i],arr[j]));
                }
            }
        }
        for (int i=0;i<pairList.size();i++) {
            System.out.println(pairList.get(i)+" which is "+origi.get(i));
        }
    }
}
