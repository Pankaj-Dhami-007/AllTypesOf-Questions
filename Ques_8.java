import java.util.*;

public class Ques_8 {
    static class calculation{
        int add(int a, int b){
            return a+b;
        }
        int add(int a, int b, int c){
            return a+b+c;
        }
        double add(double a,double b){
            return a+b;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    }
    class Animal{
        void print(){
            System.out.println("Animal");
        }
    }
    class Dogs extends Animal{
        void print(){
            System.out.println("dogs");
        }
    }
}
