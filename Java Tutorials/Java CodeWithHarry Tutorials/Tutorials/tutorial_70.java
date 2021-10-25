/*
Date 25-10-2021

In this Java tutorial, you will learn about how to implement concept of Multithreading in java using Thread class
Multithreading is a Java feature that allows concurrent execution of two or more parts of a program for maximum utilization of CPU. Each part of such program is called a thread. So, threads are light-weight processes within a process.
*/

class tutorial_70_thread_1 extends Thread {

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("I'm in Thread 1 which is build for cooking, it had been executed " + i + " times");
            System.out.println("And now also I'm in Thread 1, it had been executed " + i + " times");
        }
    }
}

class tutorial_70_thread_2 extends Thread {

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("I'm in Thread 2 which is build for chatting, it had been executed " + i + " times");
            System.out.println("And now also I'm in Thread 2, it had been executed " + i + " times");
        }
    }

}

public class tutorial_70 {
    public static void main(String[] args) {

        System.out.println("Running started...");

        tutorial_70_thread_1 t1 = new tutorial_70_thread_1();
        tutorial_70_thread_2 t2 = new tutorial_70_thread_2();

        t1.start();
        t2.start();

        System.out.println("Running ended...");
    }
}
