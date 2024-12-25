class Math{

    int x;
    double y;
    public Math(){

        this.x =0;
        this.y = 0;
    }

    public int add(int a, int b){

        int x = a+b;
        return x;
    }

    public double add(double c, double d){

        y = c+d;
        return y;
    }
}

public class Test_5 {
    public static void main(String[] args) {
        
Math math = new Math();

int a =4;
double b = 3.5;
math.add(a, a);
math.add(b, b);

System.out.println(math.x+"  "+math.y);
    }
}
