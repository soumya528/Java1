/*We have a number of bunnies and each bunny has two big floppy ears.
    We want to compute the total number of ears across all the bunnies recursively
    (without loops or multiplication).*/

package RecursionProblems;

import java.util.Scanner;

public class BunnyEars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(bunnyEars(n));
    }

    public static int bunnyEars(int bunnies) {
            if (bunnies == 0)
                return bunnies;
            return 2 + bunnyEars(bunnies - 1);  // Time Complexity O(n);

    }
}
