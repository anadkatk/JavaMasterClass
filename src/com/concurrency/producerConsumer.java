package com.concurrency;

import com.concurrency.ThreadColor;
import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.*;
import java.util.concurrent.locks.ReentrantLock;

import static com.concurrency.producerConsumerDriver.EOF;

class producerConsumerDriver {
    public static final String EOF = "EOF";

    public static void main(String[] args) {
        ArrayBlockingQueue<String> buffer = new ArrayBlockingQueue<>(6);
        //ReentrantLock bufferLock = new ReentrantLock();
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        MyProdcuer prodcuer = new MyProdcuer(buffer, ThreadColor.ANSI_YELLOW);
        MyConsumer consumer1 = new MyConsumer(buffer, ThreadColor.ANSI_PURPLE);
        MyConsumer consumer2 = new MyConsumer(buffer, ThreadColor.ANSI_CYAN);

        executorService.execute(prodcuer);
        executorService.execute(consumer1);
        executorService.execute(consumer2);

        Future<String> future = executorService.submit(new Callable<String>() {
            @Override
            public String call() throws Exception {
                System.out.println(ThreadColor.ANSI_WHITE + "Im callable class");
                return "This is a callable result";
            }
        });

        try {
            System.out.println(future.get());
        }catch (ExecutionException e){
            System.out.println(e.getMessage());
        }catch (InterruptedException e){
            System.out.println("Thread running a task was inturrupted." + e.getMessage());
        }

        executorService.shutdown();
    }
}

class MyProdcuer implements Runnable{
    private ArrayBlockingQueue<String> buffer;
    private String color;
    //private ReentrantLock bufferLock;

    public MyProdcuer(ArrayBlockingQueue<String> buffer, String color){
        this.buffer = buffer;
        this.color = color;

    }

    public void run(){
        Random random = new Random();
        String[] nums = {"1","2","3","4","5"};

        for(String num: nums){
            try{
                System.out.println(color + " adding " + num);
                //bufferLock.lock();
                buffer.put(num);


                Thread.sleep(random.nextInt(1000));
            }catch (InterruptedException e){
                System.out.println(e.getMessage());
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }

        System.out.println(color+ " Adding EOF and exiting...");

        try{
            buffer.put("EOF");
        }catch (InterruptedException e) {
            //
        }
    }
}

class MyConsumer implements Runnable{

    private ArrayBlockingQueue<String> buffer;
    private String color;

    public MyConsumer(ArrayBlockingQueue<String> buffer,String color) {
        this.buffer = buffer;
        this.color = color;
    }

    public void run() {
        while (true) {
            synchronized (buffer) {
               try {
                    if (buffer.isEmpty()) {
                        continue;
                    }
                    if (buffer.peek().equals(EOF)) {
                        System.out.println(color + " Exiting");
                        break;
                    } else {
                        System.out.println(color + " removed " + buffer.take());
                    }
                } catch (InterruptedException e) {
                    //
                }
            }
        }


    }
}