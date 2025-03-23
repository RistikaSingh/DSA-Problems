import java.util.Scanner;
public class palindrome {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        if (isPalindrome(number)) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }

        

        scanner.close();
    }

       
    public static boolean isPalindrome(int number) {
        int originalNumber = number;
        int reversedNumber = 0;

        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }
        return originalNumber == reversedNumber;
    }
    // public static boolean isPalindrome(String str) {
    //     int start = 0;
    //     int end = str.length() - 1;

    //     // Check characters from both ends moving toward the center
    //     while (start < end) {
    //         if (str.charAt(start) != str.charAt(end)) {
    //             return false; // If characters don't match, it's not a palindrome
    //         }
    //         start++;
    //         end--;
    //     }
    //     return true; // If all characters match, it's a palindrome
    // }
}






    
      