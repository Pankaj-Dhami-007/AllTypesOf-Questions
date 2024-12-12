public class Searching_1 {
    static void lenearSearch(int arr[] , int key){
        int n = arr.length;
        int index = -1;
        int temp = 0;
        for(int i =0; i< n ; i++){
            if(arr[i] == key){
                index = i;
                temp = arr[i];
                break;
            }
        }
        if(index == -1){
            System.out.println("Element not Available");
        }
        else{
            System.out.printf("element found at %d index and the element is %d" ,index, temp );
        }
    }
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50, 60, 22, 11};
        lenearSearch(arr, 40);
    }
}
