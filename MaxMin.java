import java.util.ArrayList;
import java.util.List;

public class MaxMin {
    static int find_min(int arr[]){
          int n = arr.length;
          int min = 1000000;
          for (int i = 0; i < n; i++) {
            if(arr[i] < min){
                min = arr[i];
            }
          }
          return min;
    }
    
    static int findSecondMin(int arr[]){
         int s_min = 100000;
         int n = find_min(arr);
         for (int i = 0; i < arr.length; i++) {
            if(arr[i] < s_min && arr[i] != n){
                s_min = arr[i];
            }
         }
         return s_min;
    }

    static ArrayList<Integer> removeDuplicates(int arr[]){

        int n = arr.length;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(!list.contains(arr[i])){
                list.add(arr[i]);
            }
        }
        return list;
    }
    public static void main(String[] args) {
        int num[] = {9, 8, 33, 1, 88, 22, 7, 6, 1, 9};
        System.out.println(findSecondMin(num));
        
        ArrayList<Integer> list = removeDuplicates(num);
        System.out.println(list);
        for (Integer integer : list) {
            System.out.println(integer);
        }

    }
}
