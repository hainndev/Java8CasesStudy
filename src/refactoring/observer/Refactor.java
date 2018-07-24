/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refactoring.observer;

/**
 *
 * @author hnguyen
 */
public class Refactor {

    public static void main(String[] args) {
        Feed feed = new Feed();
        feed.registerObserver(new CafeF());
        feed.registerObserver(new VnExpress());

        //Using lamda
        feed.registerObserver(tweet -> System.out.println("Dan Tri " + tweet));
        feed.registerObserver(tweet -> System.out.println("24h " + tweet));

        feed.notifyObservers("Java 8");

    }
}
