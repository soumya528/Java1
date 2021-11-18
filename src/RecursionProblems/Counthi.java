/*
Given a string, compute recursively (no loops) the number of times lowercase "hi" appears in the string.

countHi("xxhixx") → 1
countHi("xhixhix") → 2
countHi("hi") → 1
 */
package RecursionProblems;

import java.util.Scanner;

public class Counthi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(counthi(str));
    }

    public static int counthi(String str)
    {
        if(str.length()<2)
            return 0;
        if(str.substring(0,2).equals("hi"))
            return 1+counthi(str.substring(1));  //Complexity O(n)
        else
            return counthi(str.substring(1));
    }
}
