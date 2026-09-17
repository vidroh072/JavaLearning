package Threads;
class User1 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("1. Print user 1 Shopping");
            try {
                Thread.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class User2 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("2. Print user 2 Shopping");
            try {
                Thread.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}

public class CreatingThread {
    public static void main(String[] args) throws InterruptedException {
        // two ways to create threads
        // 1. using extend keyword
        System.out.println("Running program");
        User1 user1 = new User1();
        User2 user2 = new User2();
        // start method -> Thread class call run

        // initialise 2 threads
        user1.start();
        user2.start();
        

    }
}