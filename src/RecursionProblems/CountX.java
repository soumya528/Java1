/*
Given a string, compute recursively (no loops) the number of lowercase 'x' chars in the string.

countX("xxhixx") → 4
countX("xhixhix") → 3
countX("hi") → 0

 */
package RecursionProblems;

import java.util.Scanner;

public class CountX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(countX(str));
    }

    public static int countX(String str)
    {

        if(str.equals(""))
            return 0;
        if(str.charAt(0)=='x')
            return 1+countX(str.substring(1));  //Complexity O(n)
        else
            return countX(str.substring(1));

    }
}
