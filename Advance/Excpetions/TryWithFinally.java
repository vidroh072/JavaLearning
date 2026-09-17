package Excpetions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryWithFinally {
    public static void main(String[] args) {
        
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = null;
        /*
        try {
            br = new BufferedReader(in);
            String str = br.readLine();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        // works irrespective exception occur or not
        finally{
            // usefull for closing resourse 
            br.close();
        }
        */
       // try with resources
       // auto close the file but finally is prefered
       try (BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in))) {
            int n = br1.read();
            System.out.println(n);
       } catch (Exception e) {
            System.out.println("Error occured..");
       }
       System.out.println("no error");
    }
}
