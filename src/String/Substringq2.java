package String;

import java.util.Scanner;

public class Substringq2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();


        String cus = S.substring(start,end);
        System.out.println(cus);
    }
}

