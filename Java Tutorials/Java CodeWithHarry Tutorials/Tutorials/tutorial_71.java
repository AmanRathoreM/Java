/*
Date 25-10-2021

In this Java tutorial, you will learn how to achieve Multithreading using Runnable interface
*/

class tutorial_71_thread_1 implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.printf("Bullet 1 fired %d times\n", i);
            System.out.printf("Bullet 1 again fired %d times\n", i);
        }
    }
}

class tutorial_71_thread_2 implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.printf("Bullet 2 fired %d times\n", i);
            System.out.printf("Bullet 2 again fired %d times\n", i);
        }
    }
}

public class tutorial_71 {
    public static void main(String[] args) {

        System.out.println("Running started...");

        tutorial_71_thread_1 bullet_1 = new tutorial_71_thread_1();
        Thread gun_1 = new Thread(bullet_1);
        gun_1.start();
        tutorial_71_thread_2 bullet_2 = new tutorial_71_thread_2();
        Thread gun_2 = new Thread(bullet_2);
        gun_2.start();

        System.out.println("Running ended...");
    }
}
