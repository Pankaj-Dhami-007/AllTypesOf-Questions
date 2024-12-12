public class ArrQ10 {
    static int[] evenOdd(int arr[]){
        int n = arr.length;
        int evenSum =0;
        int oddSum = 0;
        for(int i =0; i<n; i++){
            if(arr[i] % 2 == 0){
                evenSum += arr[i];
            }
            else{
                oddSum += arr[i];
            }
        }
        int sum[] = {evenSum, oddSum};
        return sum;
    }
    public static void main(String args[]){
        int arr[] = {1, 2, 3, 4, 5, 6};
        int result[] = evenOdd(arr);
        System.out.println(result[0]);
        System.out.println(result[1]);
    }
}
