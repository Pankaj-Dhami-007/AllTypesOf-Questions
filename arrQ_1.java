import java.util.Scanner;
public class arrQ_1 {
    static void print(int[] arr){
        int size = arr.length;
        for(int i =0; i<size; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String atrgs[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size__");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        print(arr);
    }
}
