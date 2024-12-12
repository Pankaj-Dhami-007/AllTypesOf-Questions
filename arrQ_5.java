public class arrQ_5 {
    static int secondMax(int arr[]){
        int max = findMax(arr);
        for(int i =0; i<arr.length; i++){
            if(arr[i] == max){
                 arr[i] = Integer.MIN_VALUE;
            }

        }
        int secondMax = findMax(arr);
        return secondMax;
    }
    static int findMax(int arr[]){
        int max = Integer.MIN_VALUE;
        for(int i =0; i<arr.length; i++){
            if(arr[i] > max){
                 max = arr[i];
            }
        }
        return max;
    }
    public static void main(String atrgs[]){
        int[] arr = {11, 22, 33, 77, 4, 5, 55};
        System.out.println(secondMax(arr));
        //System.out.println(findMin(arr));

    }
}
