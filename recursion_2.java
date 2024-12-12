import java.util.Scanner;

public class recursion_2 {
    static int fact(int n){
        if(n ==0){
            return 1;
        }
           int subProb = fact(n-1);
           int selfWork = n * subProb;
           return selfWork;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fact(n));
    }
}
