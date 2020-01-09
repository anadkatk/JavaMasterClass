package com.concurrency;

import static com.concurrency.ThreadColor.ANSI_GREEN;
import static com.concurrency.ThreadColor.ANSI_PURPLE;
import static com.concurrency.ThreadColor.ANSI_RED;

public class Main {

    public static void main(String[] args) {
        System.out.println(ANSI_PURPLE+"Hello from the main thread.");
        Thread SuperManThread = new SuperManThread();
        SuperManThread.start();
        Thread anotherThread = new com.concurrency.AnotherThread();
       // anotherThread.setName("== Another Thread ==");
        anotherThread.start();

        new Thread() {
            public void run() {
                System.out.println(ANSI_GREEN + "Hello from the anonymous class thread");
            }
        }.start();

        Thread myRunnableThread = new Thread(new MyRunnable() {
            @Override
            public void run() {
                System.out.println(ANSI_RED + "Hello from the anonymous class's implementation of run()");
                try{
                    anotherThread.join(2000);
                    System.out.println(ANSI_RED + "Another thread terminated, or timed out. SO I am running again.");
                }catch (InterruptedException e){
                    System.out.println(ANSI_RED + " I coudn't wait after all. I was interrupted");
                }

            }
        });

        myRunnableThread.start();
        anotherThread.interrupt();

        System.out.println(ANSI_PURPLE+"Hello again from the main thread.");


    }
}
