import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

public class Ques_6 {
    public static HashMap<Character, Integer> calFreq(String input){
        HashMap<Character, Integer> map = new HashMap<>();
        for(char key : input.toCharArray()){
          if(map.containsKey(key)){
               map.put(key, map.get(key)+1);
          }
          else{
            map.put(key, 1);
          }
        }
        return map; 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        HashMap<Character, Integer> map = calFreq(input);
        for(Map.Entry<Character,Integer> e : map.entrySet()){
            System.out.println(e.getKey()+":"+ e.getValue());
        }
        sc.close();
    }
}
