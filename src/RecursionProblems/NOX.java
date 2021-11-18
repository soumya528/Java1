/*
Given a string, compute recursively a new string where all the 'x' chars have been removed.

noX("xaxb") → "ab"
noX("abc") → "abc"
noX("xx") → ""
 */
package RecursionProblems;

import java.util.Scanner;

public class NOX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(noX(str));
    }

    public static String noX(String str)
    {
        if(str.length()==0)
            return "";
        if(str.charAt(0)=='x')
            return ""+noX(str.substring(1));  //Complexity O(n)
        else
            return str.charAt(0)+noX(str.substring(1));
    }
}
