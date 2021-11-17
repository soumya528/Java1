/*
Given a non-negative int n, return the count of the occurrences of 7 as a digit,
so for example 717 yields 2. (no loops). Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6),
while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).

count7(717) → 2
count7(7) → 1
count7(123) → 0
 */

package RecursionProblems;

import java.util.Scanner;

public class Count7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(count7(n));
    }

    public static int count7(int n)
    {
        if(n==0)
            return 0;
        if(n%10==7)
            return 1+ count7(n/10); //Complexity O(n+1)
        else
            return count7(n/10);
    }
}
