package java;

import java.util.Scanner;
public class info {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the name");
        String name = sc.next();
        System.out.println("enter the roll no");
        int roll_num = sc.nextInt();
        System.out.println("enter your interest");
        String interest = sc.next();
        System.out.println("your information" + "  " + name + "  " + roll_num + "  " + interest);

        
    }
    
}
