import java.util.Scanner;

public class ArrQ_11{
    static int[] freq(int arr[]){
        int n = arr.length;
        int max = 0;
        int element =0;
          for(int i =0; i< n; i++){
            int count = 0;
              for(int j =0; j< n; j++){
                if(arr[i] == arr[j]){
                    count++;
                }

              }
              if(count > max){
                max = count;
               element = arr[i];
              }
          }
        return new int[] {max, element};
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter " +n+ " elements: ");
        for(int i =0; i< arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println();
        int[] demo = freq(arr);
        System.out.println("Max freq is "+demo[0]);
        System.out.println("Element is "+demo[1]);
    }
}
