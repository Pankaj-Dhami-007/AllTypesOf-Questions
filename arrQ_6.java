public class arrQ_6 {
    static int findMin(int arr[]){
        int min = Integer.MAX_VALUE;
        for(int i =0; i<arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
    
    static int findSecMin(int arr[]){
        int min = findMin(arr);
        for(int i =0; i<arr.length; i++){
              if(arr[i] == min){
                arr[i] = Integer.MAX_VALUE;
              }
        }
        int secondMin = findMin(arr);
        return secondMin;
    }
    public static void main(String args[]){
        int arr[] = {99, 77, 22, 11, 3, 5, 8, 10};
        System.out.println(findSecMin(arr));
    }
}
