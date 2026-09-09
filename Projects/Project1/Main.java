package Projects.Project1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" ----------------------");
        System.out.println("| WELCOME MERA BANK - ");
        System.out.println(" ----------------------");
        System.out.print("| Insert Card -----> ");
        sc.nextLine();
        
        System.out.println("Checking....");
        System.out.println("ENTER YOUR 4 DIGIT: ");
        

        boolean isRunning = true;
        while (isRunning){
            Customer customer = new Customer("Aakash", 50000, "4581");
            System.out.println();
            System.out.println(" ----------------------");
            System.out.println("| Welcome ");
            System.out.println(" ----------------------");
            System.out.println("| 1. Check Balance");
            System.out.println("| 2. Deposit");
            System.out.println("| 3. Withdraw");
            System.out.println("| 0. Exit");
            System.out.println(" ----------------------");
            System.out.print(" ----> ");
            int userChoice = sc.nextInt();
            switch (userChoice) {
                case 1 -> System.out.println("Check Balance"); 
                case 2 -> System.out.println("Deposit");
                case 3 -> System.out.println("withdraw");
                case 0 -> isRunning = false;
                default -> System.out.println("Wrong Input...");
            }
        }
    }
}
