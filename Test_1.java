class ExceptionHandling{

    public void test(int arr[]){

        try {
            for (int i = 0; i < 7; ++i) {
                System.out.print(arr[i]);
            }
            
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("0");
        }
    }

    public int temp(int x, int y){
        return ++x;
    }
}

public class Test_1 {
    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4, 5};
        ExceptionHandling e = new ExceptionHandling();
        System.out.println(nums.length);
        e.test(nums);
        int x = 10;
        System.out.println(x++);
        System.out.println(x);
    }
}
