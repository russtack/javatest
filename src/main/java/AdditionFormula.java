
import java.util.Scanner;

public class AdditionFormula {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give the first number:");
        int num = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int num1 = Integer.valueOf(scanner.nextLine());
        System.out.println(num+" + "+num1+" = "+(num+num1));

        // write your program here

    }
}
