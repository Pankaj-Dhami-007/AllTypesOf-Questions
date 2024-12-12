public class ArrQ_13 {
    static boolean target(int arr[], int key){
           int n = arr.length;
           
           for(int i =0; i<n-1; i++){
            for(int j =0; j< n; j++){
                if(arr[i]+arr[j] == key){
                   return true; 
                }
            }
           }
           return false;
    }
    public static void main(String[] args) {
        int arr[] = {1, 4, 2, 7, 6, 3, 9};
        int a = 99;
        System.out.println(target(arr, a));
    }
}
