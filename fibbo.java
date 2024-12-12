import java.util.Scanner;

public class fibbo {
    static int print(int n){
        int fact = 1;
        int i = n;
          while (i>0) {
          fact = fact * i;
              i--;
          }
          return fact;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(print(n));
    }
}
