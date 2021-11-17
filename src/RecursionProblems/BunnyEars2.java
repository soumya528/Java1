/*
We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies (1, 3, ..) have the normal 2 ears.
The even bunnies (2, 4, ..) we'll say have 3 ears, because they each have a raised foot.
Recursively return the number of "ears" in the bunny line 1, 2, ... n (without loops or multiplication).
 */

package RecursionProblems;

import java.util.Scanner;

public class BunnyEars2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(bunnyEars2(n));
    }

    public static int bunnyEars2(int bunnies) {
        if (bunnies == 0)
            return bunnies;
        if((bunnies%2 != 0))
             return 2 + bunnyEars2(bunnies - 1);  // Time Complexity O(n);
        else
            return 3 + bunnyEars2(bunnies - 1);

    }
}
