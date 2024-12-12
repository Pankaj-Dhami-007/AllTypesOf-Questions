import java.util.*;

public class xyz {
    static int maxOccr(int arr[]){
        int n = arr.length;
        int max =0;
        int element = 0;
        for(int i =0; i< n; i++){
            int count = 0;
            for(int j = i+1; j<n; j++){
                if(arr[i] == arr[j]){
                     count++;

                }
            }
            if(count > max){
                max = count;
                element = arr[i];
            }
        }
        return max;
    }
    static int hash(int arr[]){
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i =0; i< n; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            }
            else{
                map.put(arr[i], 1);
            }
        }
        //System.out.println(map.entrySet());
        int max = 0;
        int element = -1;
        for(int key : map.keySet()){
                if(map.get(key) > max){
                    max = map.get(key);
                    element = key;
                }
        }
        return element;
    }
    public static void main(String[] args) {
        int num[] = {1, 2, 3, 4, 1, 2, 1, 1, 1, 77, 3, 4};
        System.out.println(maxOccr(num));
        
        //System.out.println(hash(num));
    }
}
