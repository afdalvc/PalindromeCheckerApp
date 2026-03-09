import java.util.Scanner;
<<<<<<< HEAD

public class PalindromeCheckerApp {

    public static boolean isPalindrome(String input) {

        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        char[] arr = normalized.toCharArray();

=======

class PalindromeChecker {

    public boolean checkPalindrome(String input) {

        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        char[] arr = normalized.toCharArray();
>>>>>>> feature/UC11
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            if (arr[left] != arr[right]) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = scanner.nextLine();

<<<<<<< HEAD
        if (isPalindrome(input)) {
            System.out.println("The given string is a palindrome (ignoring spaces and case).");
=======
        PalindromeChecker checker = new PalindromeChecker();

        boolean result = checker.checkPalindrome(input);

        if (result) {
            System.out.println("The given string is a palindrome.");
>>>>>>> feature/UC11
        } else {
            System.out.println("The given string is not a palindrome.");
        }

        scanner.close();
    }
}