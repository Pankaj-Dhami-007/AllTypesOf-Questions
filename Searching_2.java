public class Searching_2 {
    static int binarySearch(int arr[], int key) {
        int n = arr.length;
        int low = 0;
        int high = n - 1;
        
        while (low <= high) {
            int mid = (low + high) / 2;
            System.out.println("low: " + low + ", high: " + high + ", mid: " + mid + ", arr[mid]: " + arr[mid]);  // Debugging
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] > key) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 50, 60, 70 };
       int result = binarySearch(arr, 30);
       System.out.println("Element Found at index "+result);
    }
}
