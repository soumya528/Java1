/*
Given a non-negative int n, compute recursively (no loops) the count of the occurrences of 8 as a digit,
except that an 8 with another 8 immediately to its left counts double, so 8818 yields 4. Note that mod (%)
by 10 yields the rightmost digit (126 % 10 is 6), while divide (/) by 10 removes the rightmost digit
(126 / 10 is 12).

count8(8) → 1
count8(818) → 2
count8(8818) → 4
 */

package RecursionProblems;

import java.util.Scanner;

public class Count8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(count8(n));
    }

    public static int count8(int n)
    {
        if(n<1)
            return 0;
        if(n%10==8 && (n/10)%10==8)
            return 2 + count8(n/10);
        else if(n%10==8)
            return 1+ count8(n/10); //Complexity O(2n+1+2)
        else
            return count8(n/10);

    }
}
