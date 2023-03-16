
// Throwing New Error

import java.util.Scanner;

public class New_Error_Throw {
    // function to check if person is eligible to vote or not
    public static void validate(int age) {
        if (age < 18) {
            // throw Arithmetic exception if not eligible to vote
            throw new ArithmeticException("Person is not eligible to vote");
        } else {
            System.out.println("Person is eligible to vote!!");
        }
    }

    public static void main(String args[]) {
        System.out.println("Enter age : ");
        try (Scanner user = new Scanner(System.in)) {
            int x = user.nextInt();
            validate(x);
        }
    }
}