package com.Car;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestingList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        final int SIZE=5000;
        long startTime = System.nanoTime();
        for (int i=1;i<=SIZE;++i){
            list.add(i);
            linkedList.add(i);
        }
        long endTime = System.nanoTime();
        long duration = endTime-startTime;
       // System.out.println("The duration was for ArrayList was   "+duration);

         startTime = System.nanoTime();
        /*for (int i=0;i<list.size();++i){
            list.set(i,(i*i));
        }*/
        //list.add(5,36);
        //list.add(36,1005);
        //list.add(4050,1200);
        list.remove(42);
        list.remove(4097);
        endTime = System.nanoTime();
         duration = endTime-startTime;
        System.out.println("The duration was for ArrayList was  "+duration);

        startTime = System.nanoTime();
        /*for (int i=0;i<linkedList.size();++i){
            linkedList.set(i,i*i);
        }*/
        //linkedList.add(5,36);
        //linkedList.add(36,1005);
        //linkedList.add(4050,1200);
        linkedList.remove(40);
        linkedList.remove(2323);
        endTime = System.nanoTime();
        duration = endTime-startTime;
        System.out.println("The duration was for LinkedList was "+duration);


        int[] array = new int[SIZE];

        startTime = System.nanoTime();
        for(int i=0;i<array.length;++i){
            array[i] = i;
        }
        endTime=System.nanoTime();
        duration = endTime-startTime;
        System.out.println("The duration was for Array was "+duration);



        for (int l:list){
            //System.out.println(l);
        }
    }
}
