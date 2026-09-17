package Threads;
class User1 implements Runnable{
    @Override
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println("User1 Running..");
            try {Thread.sleep(5);}
            catch(Exception e){System.out.println("Error");}
        }
    }
}
class User2 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("User2 alsoRunning..");
            try {Thread.sleep(5);}
            catch(Exception e){System.out.println("Error");}
        }
    }
}
public class BetterWay {
    public static void main(String[] args) {
        User1 user1 = new User1();
        User2 user2 = new User2();

        Thread th1 = new Thread(user1);
        Thread th2 = new Thread(user2);
        System.out.println("Modern Way using lambda");
        th1.start();
        th2.start();
        
        // functionaal interfaace
        // here Thread is not functional interface
        // Runnable is functional interface and thread take Runnable as argument
        Thread th3 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("user from lambda..");
            }
        });
        th3.setPriority(Thread.MAX_PRIORITY);
        th3.start();
        
    }
    
}