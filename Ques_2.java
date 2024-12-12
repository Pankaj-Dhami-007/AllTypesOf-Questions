import java.util.HashSet;
import java.util.Iterator;

public class Ques_2 {
    static void dup(int arr[]){
         HashSet<Integer> set = new HashSet<>();
          for(int i =0; i< arr.length; i++){
            set.add(arr[i]);
          }
          Iterator it = set.iterator();
          while(it.hasNext()){
            System.out.println(it.next());
          }

    }
    public static void main(String[] args) {
        int num[] = {1, 2, 3, 4,3 ,2, 1, 1, 77, 9};

        dup(num);
    }
}
