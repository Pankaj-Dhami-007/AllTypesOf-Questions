import java.util.*;

public class xyzz {
    public static void primeNo(int n){
        int sum =0;
           for (int i = 1; i <= n; i++) {
            int count = 0;
                for (int j = 1; j <= n; j++) {
                    if(i % j == 0){
                        count++;
                    }
                }
                if(count == 2){
                    System.out.print(i+" ");
                    sum+=i;
                }

           }
           System.out.println(sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any no ");
        int n = sc.nextInt();
        
        primeNo(n);
    }
}
