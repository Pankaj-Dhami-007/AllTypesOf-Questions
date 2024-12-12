//Write a code to reverse a number. 123 -> 321

import java.util.Scanner;

public class Ques_4 {
    static int recursiveWay(int n, int reverse){
        
        if(n == 0){
            return reverse;
        }
        else{
            int lastDig = n%10;
            reverse = reverse * 10 + lastDig;// self work = 3
            return recursiveWay(n/10, reverse);
        }
    }
     static int noReverse(int n){
      int reverse =0;
        while(n !=0){
            int lastDig = n % 10;
            reverse = reverse * 10 + lastDig;
            n = n/ 10; 
        }
        return reverse; 
     }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //System.out.println(noReverse(n));
        System.out.println(recursiveWay(n, 0));

    }
}
