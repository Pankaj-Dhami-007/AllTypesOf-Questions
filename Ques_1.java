import java.util.*;
public class Ques_1 {

    //brute force tc = o(n2)
    static int maxOccur(int arr[]){
        int n = arr.length;// 1 2 1 1 3
        int max =0;
        int element = 0;
        for(int i =0; i<n; i++){
            int count = 0;
              for(int j = 0; j<n; j++){  
                if(arr[i] == arr[j]){
                    count++;
                }
              }
              if(count > max){
                max = count;
                element = arr[i];
              }

        }
        int secondMax = 0;
        int sElement = -1;
        
        return max;
    }
    //using hashmap. tc = o(n)
    static int hashF(int arr[]){
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
        int max = 0;
        int element = -1;
        for(int i : map.keySet()){
           if(map.get(i) > max){
            max = map.get(i);
             element = i;
           }
        }
        int sMax =0;
        int sElement = -1;
        for(int key : map.keySet()){
              if(map.get(key) > sMax && map.get(key) < max){
                sMax = map.get(key);
                sElement = key;
              }
        }
        return sElement;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter Array Size : ");
        int n = sc.nextInt();
        int[] num = new int[n];
        System.out.println("Enter elemnents: ");
        for(int i =0; i< num.length; i++){
            num[i] = sc.nextInt();
        }
        System.out.println();
        for(int i : num){
            System.out.print(i+" ");
        }
        System.out.println();
        //System.out.println(maxOccur(num));
        System.out.println(hashF(num));
    }
}
