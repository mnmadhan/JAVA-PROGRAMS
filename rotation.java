import java.util.*;
public class rotation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> al = new ArrayList<Integer>();
        System.out.println("Enter numbers (type -1 to stop):");
        while(true){
            int n = scan.nextInt();
            if(n==-1){
                break;
            }
            else{
                al.add(n);
            }
        }
        
        int ro = scan.nextInt();
        int nu = al.size();
        ro = ro % nu;
        for(int i=nu-ro;i<nu;i++){
             System.out.print(al.get(i)+" ");
        }
        for(int i=0;i<ro;i++){
            System.out.print(al.get(i)+" ");
        }
    }
}
