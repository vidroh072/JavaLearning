package Basics.Base1;

import java.util.Scanner;   // import external package
// .* -> all files not folder

public class Pack {
    public static void main(String a[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Name:  ");
        String name = sc.nextLine();
        System.out.println(name);
    }
}
