package Java;

import java.util.Scanner;

public class StringPallindrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String rev = "";
        System.out.println("ENter the string");
        String str1 = sc.next();
        for (int i = 0; i < str1.length(); i++) {
            rev = str1.charAt(i) + rev;
        }
        String temp = rev;
        if (str1 == temp) {
            System.out.println("palindrom");
        } else {
            System.out.println("not pallindrom");
        }
        sc.close();
    }

}
