import jdk.nashorn.internal.ir.WhileNode;

import java.util.Scanner;

public class reversenum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int rev = 0;
        while (num != 0) {
            rev = (rev * 10) + (num % 10);
            num = num / 10;
        }
        System.out.println(rev);
    }
}