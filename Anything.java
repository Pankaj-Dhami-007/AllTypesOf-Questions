public class Anything {

    static int binarySearch(int arr[], int target){
     
        int low = 0;
        int high = arr.length-1;
        while (low<= high) {
            int mid = low+(high- low)/2;
            if (arr[mid] == target) {
                return mid;
            }
            else if (arr[mid] < target) {
                low = mid+1;
            }
           else{
                high = mid-1;
           }
        }
        return -1;
    }
    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4, 5, 6, 7, 88, 99, 111, 123, 200, 500};
        int result = binarySearch(nums, 88);
         if (result != -1) {
            System.out.println("Element found at "+result+"th index and Element is "+nums[result]);
         }
         else{
            System.out.println("THe element is not available in this Array try another Element");
         }
    }
}
