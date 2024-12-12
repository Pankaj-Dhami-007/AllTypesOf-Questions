import java.util.*;
public class recursion_1 {
    static void printDesc(int n){
        if(n == 1){
            System.out.println(1);
            return;
        }
        System.out.println(n);
        printDesc(n-1);
    }

    static void printAsc(int n){

        if(n == 1){
            System.out.println(1);
            return;
        }
        printAsc(n-1);
        System.out.println(n);

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printDesc(n);
    }
}
