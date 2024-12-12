import java.util.Scanner;

public class recursion_3 {
    static int numSum(int n){
        int sum = 0;
        for(int i = 1; i<=n; i++){
            if(i % 2 != 0){
                sum = sum +i;
            }
            else{
                sum = sum -i;
            }
        }
        return sum;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(numSum(n));
    }
}
