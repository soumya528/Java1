package RecursionProblems;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println(Fact(n));
    }

    public static int Fact(int n)
    {
        if(n==1)
            return n;
        return n*Fact(n-1);  // Time Complexity O(n);
    }
}
