import java.util.*;
public class demo{
    static int add(int n){
        int sum = 0;
        while (n>0) {
            int temp = n%10;
            sum = sum+temp;
            n = n/10;
        }
        return sum;
    }
    static void isPrime(int n){
        int count = 0;
        for(int i =2; i<=n; i++){
            if(n%i == 0){
                count++;
            }

        }
        if(count == 1){
            System.err.println("Prime No");
        }
        else{
            System.err.println("Not a Prime No");
        }
    
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a No");
        int n = sc.nextInt();
        //int x = print(n);
        isPrime(n);
        int sum = add(n);
        System.out.println();
        isPrime(sum);
    }
}