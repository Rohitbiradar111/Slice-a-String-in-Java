//This program slices a string i.e removes first and last character of a string in Java

import java.util.Scanner;
public class StringSlice {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String = ");
        String s = sc.nextLine();
        System.out.println("Length of the String = "+s.length());
        sc.close();
        System.out.println(s.substring(1,s.length()-1));
    }
}