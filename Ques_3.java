public class Ques_3 {
    static int missingNo(int arr[]){
        int n = arr.length;
        int oL = n+1;
        int o_Sum = (oL*(oL+1))/2;
        int sum = 0;
        for(int i =0; i< n; i++){
            sum +=arr[i];
        }
        return o_Sum - sum;
    }
    public static void main(String[] args) {
        int num[] = {1, 2, 3, 5, 6};
        System.out.println(missingNo(num));
    }
}
