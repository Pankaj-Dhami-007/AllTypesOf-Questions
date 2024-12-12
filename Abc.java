class Abc{
    static int binarySearch(int arr[], int target){
        if (target <0) {
            System.out.println("invalid Index");
            
        }

        int low = 0;
        int high = arr[arr.length-1];

        while (low <= high) {
            int mid = low +(high - low)/2;
            if (target == arr[mid]) {
                return mid;
            }
            else if(target > arr[mid]){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return -1;
    }
    static int missingNo(int arr[]){
           int currLength = arr.length;
           int n = currLength+1;
           int newArr[] = new int[n];
           int oldSum =0;
           int newSum = n*(n+1)/2;
           for (int i = 0; i < arr.length; i++) {
               oldSum+=arr[i];
           }
           return newSum-oldSum;
    }
    public static void main(String[] args) {
        int nums[] = {1,2,3,4,6};
        System.out.println(missingNo(nums));

        System.out.println("Element found at "+binarySearch(nums, 3)+" index");
    }
}