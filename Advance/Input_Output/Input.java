package Input_Output;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
    /*  just like output there is input object
        give ASCII
        in -> object of input Stream
     
        try {
            int n = System.in.read();
            System.out.println(n);
        } catch (IOException e) {
            System.out.println("Input exception");
        }

        not use  ^
        More better way
        Buffered Reader
        
        */
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(in);
        System.out.println("NEW");
    
        try {
            int num = Integer.parseInt(bf.readLine());
            System.out.println(num);    
        } catch (Exception e) {
            System.out.println("Error");
        }
        System.out.println("More New");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(n);
    }
}
