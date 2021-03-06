package class3;

import java.util.Scanner;

public class PalindromeNumber {
    static boolean isPalindrome(String n) {
        int i = 0;
        int j = n.length() - 1;
        while (i < j) {
            if (n.charAt(i) != n.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.next();
        System.out.println(isPalindrome(n));
    }
}
