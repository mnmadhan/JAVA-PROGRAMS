import java.util.*;
public class peaknumber {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int arr[] = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = scan.nextInt();
        }
        List<Integer> al = new ArrayList<Integer>();
        for(int i=1;i<size-1;i++){
            if(arr[i]>arr[i-1]&&arr[i]>arr[i+1]){
                al.add(arr[i]);
            }
        }
        System.out.print(al);
    }
}