import java.util.Scanner;

public class num_1 {
      static void printNum(int n, int m){
        for(int i =1; i<=n; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(i+" ");
            }
            
            System.out.println();
          }
      }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two No");
        int n = sc.nextInt();
        int m = sc.nextInt();
        printNum(n, m);

    }

}