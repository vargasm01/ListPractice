/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture2;

/**
 *
 * @author MVargas
 */
public class Counter {

    int myCount = 0;
    static int ourCount = 0;

    void increment() {
        this.myCount++;
        Counter.ourCount++;
    }

    public static void main(String[] args) {

        Counter counter1 = new Counter();
        Counter counter2 = new Counter();

        counter1.increment();
        counter1.increment();
        counter2.increment();

        System.out.println("Counter 1: " + counter1.myCount + " " + 
                Counter.ourCount);

        System.out.println("Counter 2: " + counter1.myCount + " " + 
                Counter.ourCount);

        System.out.println("Counter 1: " + counter1.myCount + " " + 
                Counter.ourCount);

    }

}
