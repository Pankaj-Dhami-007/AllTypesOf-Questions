public class arrQ_3 {
    static void printArr(int[] arr){
        int size = arr.length;
        for(int i =0; i<size; i++){
            System.out.print(arr[i]+" ");
        }
    }
        static int find(int arr[], int key){
            int temp = -1;
            for(int i =0; i< arr.length; i++){
                if(arr[i] == key){
                    temp = i;
                    break;
                }
            }
            return temp;
        }
    public static void main(String atrgs[]){
        int[] arr = {1, 2, 3, 2, 4, 5, 5};
        int key;
        System.out.println(find(arr, 3));
    }
}
