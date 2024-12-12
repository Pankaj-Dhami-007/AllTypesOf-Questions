public class ArrQ_8 {
    static void duplicate(int arr[]){
        for(int i =0; i< arr.length-1; i++){
            for(int j =i+1; j<arr.length; j++){
               if(arr[i] == arr[j]){
                System.out.print(arr[j]+" ");
               }  
            }
        }
    }
    public static void main(String args[]){
        int arr[] = {33, 44, 33};
        duplicate(arr);
    }
}
