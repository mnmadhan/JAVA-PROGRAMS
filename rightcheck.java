import java.util.*;

public class rightcheck {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int arr[] = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = scan.nextInt();
        }
        for (int i = 0; i < size; i++) {
            int count = 0;
            for (int j = i + 1; j < size; j++) {
                if (arr[j] < arr[i]) {
                    count++;
                }
            }
            System.out.print(count + " ");
        }
    }
}
