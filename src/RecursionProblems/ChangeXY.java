/*

Given a string, compute recursively (no loops) a new string where all the lowercase 'x' chars have been changed to 'y' chars.

changeXY("codex") → "codey"
changeXY("xxhixx") → "yyhiyy"
changeXY("xhixhix") → "yhiyhiy"
 */
package RecursionProblems;

import java.util.Scanner;

public class ChangeXY {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(codexy(str));
    }

    public static String codexy(String str)
    {
        if(str.length()==0)
            return "";
        if(str.charAt(0)=='x')
            return "y"+codexy(str.substring(1));  //Complexity O(n)
        else
            return str.charAt(0)+codexy(str.substring(1));
    }
}
