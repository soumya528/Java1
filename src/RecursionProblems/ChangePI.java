/*
Given a string, compute recursively (no loops) a new string where all appearances of "pi" have been replaced by "3.14".

changePi("xpix") → "x3.14x"
changePi("pipi") → "3.143.14"
changePi("pip") → "3.14p"
 */
package RecursionProblems;

import java.util.Scanner;

public class ChangePI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(changePI(str));
    }

    public static String changePI(String str)
    {
        if(str.length()<=1)
            return str;
        if(str.substring(0,2).equals("pi"))
            return "3.14"+changePI(str.substring(2));  //Complexity O(n)
        else
            return str.charAt(0)+changePI(str.substring(1));
    }
}
