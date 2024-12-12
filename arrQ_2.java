public class arrQ_2 {
    static void print(int[] arr){
        int size = arr.length;
        for(int i =0; i<size; i++){
            System.out.print(arr[i]+" ");
        }
    }
    static void duplicate(int[] num){
        int n = num.length;
        for(int i = 0; i< n-1; i++){
            for(int j = i+1; j<n; j++){
                if(num[i] == num[j] && (i != j)){
                    System.out.println("Dupl value is "+num[i]);
                }
            }
        }
    }
    static void demo(int[] num){
        int n = num.length;
        int x = 0;
        for(int i = 0; i< n-1; i++){
            if(num[i] == num[i+1]){
                System.out.println(num[i]);
                
            }
            
        }
    }
    public static void main(String atrgs[]){
        int[] arr = {1, 2, 3, 2, 4, 5, 5};
        //duplicate(arr);
        demo(arr);
    }
}
