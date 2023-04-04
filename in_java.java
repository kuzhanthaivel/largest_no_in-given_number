import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = input.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = input.nextDouble();

        if (num1 > num2) {
            System.out.println(num1 + " is the largest number");
        }
        else if (num2 > num1) {
            System.out.println(num2 + " is the largest number");
        }
        else {
            System.out.println("Both numbers are equal");
        }

        input.close();
    }
}
