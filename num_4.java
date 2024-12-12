import java.util.Scanner;

public class num_4 {
    static void printNum(int n, int m){
        
        for(int i =1; i<=n; i++){
            for(int j = 1; j<=i; j++){
                if((i+j) % 2 == 0){
                    System.out.print("A"+" ");
                }
                else{
                    System.out.print("B"+" ");
                }
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
