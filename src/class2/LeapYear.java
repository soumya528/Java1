package class2;

import java.util.Scanner;

public class LeapYear {
    static boolean isLeapYear(int n) {
        if (n % 4 == 0) {
            if (n % 100 == 0) {
                return n % 400 == 0;
            }
        } else {
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        boolean ans = isLeapYear(n);
        int ansInt;
        if (ans) {
            ansInt = 1;
        } else {
            ansInt = 0;
        }
        System.out.println(ansInt);
    }
}
