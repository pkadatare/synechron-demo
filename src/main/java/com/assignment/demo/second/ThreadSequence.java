package com.assignment.demo.second;

public class ThreadSequence {

  public static final int N = 5;

  public static void main(String[] args) throws InterruptedException {

    Thread[] threads = new Thread[8];
    for (int i = 0; i < N; i++) {
      threads[i] = new Thread(()->System.out.println(Thread.currentThread()));
      threads[i].start();
      threads[i].join();
    }
  }



}
