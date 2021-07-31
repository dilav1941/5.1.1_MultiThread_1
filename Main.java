package com.company;

public class Main {

    public static void main( String[] args ) throws InterruptedException {

        ThreadGroup group = new ThreadGroup ("Группа потоков");

        // создание потоков
        MyThread thread1 = new MyThread (group, "Поток 1");
        MyThread thread2 = new MyThread (group, "Поток 2");
        MyThread thread3 = new MyThread (group, "Поток 3");
        MyThread thread4 = new MyThread (group, "Поток 4");

        thread1.start ();
        thread2.start ();
        thread3.start ();
        thread4.start ();

        // остановка текущего потока на 15 секунд
        Thread.sleep (15000);

        // остановка группы потоков "group"
        Thread.currentThread ().getThreadGroup ().interrupt ();
    }
}
