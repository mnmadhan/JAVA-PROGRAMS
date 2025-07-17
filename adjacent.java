import java.util.*;

public class adjacent {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        boolean found = false; 

        for (int i = 10; i <= N; i++) {
            int num = i;
            boolean valid = true;

            while (num >= 10) {
                int d1 = num % 10;
                int d2 = (num / 10) % 10;

                if (Math.abs(d1 - d2) != 1) {
                    valid = false;
                    break;
                }
                num = num / 10;
            }

            if (valid) {
                System.out.print(i + " ");
                found = true;
            }
        }

        if (!found) {
            System.out.print("-1");
        }
    }
}
