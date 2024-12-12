/**
 * ArrQ_12
 */
import java.util.*;
public class ArrQ_12 {
    static void del(int n, int arr[], int key){
        int dep[] = new int[n-1];
        for(int i =0; i< n; i++){
            if(i < key){
                dep[i] = arr[i];// 10, 20, 30

            }
            else if(i == key){
                continue;
            }
            else{
                dep[i-1] = arr[i];
            }
        }
        for (int j = 0; j < dep.length; j++) {
            System.out.print(dep[j]+" ");
        }
    }

    public static void main(String args[]){
        Scanner ab = new Scanner(System.in);
        System.out.println("Enter the Size of an array ");
        int n = ab.nextInt();
        int num[] = new int[n];// 10, 20, 30, 40, 50, 60
        System.out.println("Enter Elements...");
        for(int i =0; i< n; i++){
            num[i] = ab.nextInt();
        }
        System.out.println("Enter index that you want to delete in this array ..");
        int f = ab.nextInt();

        del(n, num, f);
    }
}