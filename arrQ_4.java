public class arrQ_4 {
    
    static int findMin(int arr[]){
        int min = Integer.MAX_VALUE;
        for(int i =0; i< arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
       static int findMax(int arr[]){
           int max = Integer.MIN_VALUE;
            for(int i = 0; i<arr.length; i++){
                 if(arr[i] > max ){
                     max = arr[i];
                 }
            }
            return max;
       }
    public static void main(String atrgs[]){
        int[] arr = {11, 22, 33, 77, 4, 5, 55};
        System.out.println(findMax(arr));
        System.out.println(findMin(arr));

    }
}
