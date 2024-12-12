import java.util.Scanner;

public class stars_4 {
    static void patterns(int n, int m){
      for(int i =n; i>=1; i--){
        for(int j = 1; j<=i; j++){
            System.out.print("*"+" ");
        }
        
        System.out.println();
      }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two No");
        int n = sc.nextInt();
        int m = sc.nextInt();
        patterns(n, m);

    }
}
