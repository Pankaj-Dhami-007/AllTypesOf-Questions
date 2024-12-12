import java.util.HashMap;
import java.util.Map;

public class Dmo {
    static void freq(int arr[]){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i =0; i< arr.length; i++){
            if(map.containsKey(arr[i])){
             map.put(arr[i], map.get(arr[i])+1);
            }
            else{
                map.put(arr[i], 1);
            }
        }

       //System.out.println(map);
        for(Map.Entry<Integer,Integer> i : map.entrySet()){

            System.out.println(i+" ");
        }
        
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 1, 1, 2, 1, 3};
        freq(arr);
    }
}
