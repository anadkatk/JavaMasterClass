package com.concurrency;

import static com.concurrency.ThreadColor.ANSI_RED;

public class SuperManThread extends  Thread{

    @Override
    public void run(){

        try{
            Thread.sleep(5000);
            System.out.println(ANSI_RED + " I am superman");
        }catch (Exception e){
            System.out.println(e.getMessage());
            System.out.println(e.getStackTrace());
        }
    }
}
