package FI_Proj7_EvenOdd_Multithreading;

public class UseThread {
    public static void main(String[] args) {
        Runnable r = () -> {
            try{
                for (int i = 2; i<=10; i+=2){
                    System.out.println("Child Thread running :: "+ i);
                    Thread.sleep(200);
                }
            }catch (InterruptedException interruptedException){
                System.out.println("Child Thread Intrupted" + interruptedException.getMessage());
            }
        };

        Thread thread = new Thread(r);
        thread.start();
        try{
            for (int i = 1; i<=10; i+=2){
                System.out.println("Main Thread running :: "+ i);
                Thread.sleep(200);
            }
        }catch (InterruptedException interruptedException){
            System.out.println("Main Thread Intrupted" + interruptedException.getMessage());
        }
    }
}
