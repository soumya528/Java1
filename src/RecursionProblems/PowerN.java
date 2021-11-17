/*
Given base and n that are both 1 or more, compute recursively (no loops) the value of base to the n power,
so powerN(3, 2) is 9 (3 squared).

powerN(3, 1) → 3
powerN(3, 2) → 9
powerN(3, 3) → 27
 */

package RecursionProblems;

import java.util.Scanner;

public class PowerN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(powerN(base,n));
    }

    public static int powerN(int base, int n)
    {
        if(n<1)
            return 1;
        return base * powerN(base,n-1); //Complexity O(n)

    }
}
