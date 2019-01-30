package java;

import java.util.Scanner;

public class FibonaccSample {
    public static void main(String[] args) {

        //
        System.out.println("Enter Number : ");
        int number = new Scanner(System.in).nextInt();
        System.out.println("Enter Number : "+number);

    }

    public static String isPrimeOrNot(int num) {
        if (num < 0) {
            return "not valid";
        }
        if (num == 0 || num == 1) {
            return "not prime";
        }
        if (num == 2 || num == 3) {
            return "prime number";
        }
        if ((num * num - 1) % 24 == 0) {
            return "prime";
        } else {
            return "not prime";
        }
    }

    public void palindrome()
    {
        {
            String original, reverse = ""; // Objects of String class
            Scanner in = new Scanner(System.in);

            System.out.println("Enter a string to check if it is a palindrome");
            original = in.nextLine();

            int length = original.length();

            for (int i = length - 1; i >= 0; i--)
                reverse = reverse + original.charAt(i);

            if (original.equals(reverse))
                System.out.println("The string is a palindrome.");
            else
                System.out.println("The string isn't a palindrome.");

        }
    }
}
