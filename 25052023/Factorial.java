import java.util.Scanner;

class Factorial {
    public static int fact(int num) {
        if (num == 0) {
            return 1;
        }

        return num * fact(num - 1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = input.nextInt();

        if (num < 0) {
            System.out.println("Invalid input. Please enter the positive integer!!! ");
        } else {

            int factorial = fact(num);
            System.out.println("The factorial of " + num + " is = " + factorial);

        }

    }
}