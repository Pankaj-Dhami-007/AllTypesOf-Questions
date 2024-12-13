public class Test_2 {
    public static void main(String[] args) {
        StringBuffer str1 = new StringBuffer("Dhami");
        StringBuffer str2 = new StringBuffer("Dhami");
        if (str1.equals(str2)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        StringBuilder builder = new StringBuilder("Dhami");
        System.out.println(str1.length());
        System.out.println(builder.length());

        String s1 = "Dhami";
        String s2 = "Mohan";
        String s3 = "Dhami";
        String s4 = new String("Dhami");
        String s5 = new String("Shivam");
        if (str1.equals(str2)) {
            System.out.println("success");
            
        } else {
            System.out.println("Failed");
        }

        if (s1 == s2) {
            
            System.out.println("Eat banana");
        } else {
            System.out.println("Eat apple");
        }

        if (s1.equals(s2)) {
            System.out.println("success");
            
        } else {
            System.out.println("Failed");
        }

        if (s1.equals(s3)) {
            System.out.println("success");
            
        } else {
            System.out.println("Failed");
        }
    }
}
