/*
For this exercise, you need to read inputs from stdin and print them to stdout.

Input Format

There are three lines of input.
Line one contains an integer.
Line two contains a double.
Line three contains a String.

Output Format

On the first line, print String: followed by the unaltered input String.
On the second line, print Double: followed by the unaltered input double.
On the third line, print Int: followed by the unaltered input integer.
*/

package Introduction;

import java.util.Scanner;

public class InOut {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        String s = scan.nextLine();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}