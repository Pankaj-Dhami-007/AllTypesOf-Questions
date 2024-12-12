import java.util.Scanner;

public class Ques_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input from the user
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Iterate over each character in the string
        for (char c : input.toCharArray()) {
            // Print each character
            System.out.println(c);
        }
    }
}
