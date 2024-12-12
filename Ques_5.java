public class Ques_5 {
    static void fibbo(int n ){// 0, 1, 1, 2, 3, 5, 8, 13 
        int a = 0;
        int b = 1;
        for(int i =0; i< n; i++){
            System.out.println(a);
            int c = a+b;
            a = b;
            b = c;
        }
    }
    public static void main(String[] args) {
        int n = 10;
        fibbo(n);
    }
}
