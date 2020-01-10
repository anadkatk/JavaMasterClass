package com.concurrency;

public class DeadLocks {

    public static Object lock1 = new Object();
    public static Object lock2 = new Object();

    public static void main(String[] args) {
	  //  new Thread1().start();
	   // new Thread2().start();

        //boo();
    }

    public static void boo() {
        for(double i=0;i<10;i += 1.9){
            System.out.println(i);
        }
    }
    private static class Thread1 extends Thread{
        public void run(){
            synchronized (DeadLocks.lock1){
                try {
                    Thread.sleep(100);

                }catch (InterruptedException e){
                    //
                }
                System.out.println("Thread 1: Waiting for lock 2");
                synchronized (lock2){
                    System.out.println("Thread 1: Has lock 1 and lock2");
                }
                System.out.println("Thread 1: Release lock2");
            }
            System.out.println("Thread 1: Release lock1. Exiting...");
        }
    }

    private  static class Thread2 extends Thread{
        public void run(){
            synchronized (lock1){
                System.out.println("Thread 2: Has lock2");
                try{
                    Thread.sleep(100);
                }catch (InterruptedException e){

                }
                System.out.println("Thread 2: Waiting for lock1");
                synchronized (lock2){
                    System.out.println("Thread 2: Has lock2 and lock1");
                }
                System.out.println("Thread 2: released lock1");
            }
            System.out.println("Thread 2: Release something");
        }

    }
}

