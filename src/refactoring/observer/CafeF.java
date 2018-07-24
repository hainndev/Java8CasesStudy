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
public class CafeF implements Observer {

    @Override
    public void notify(String tweet) {
        System.out.println("CafeF " + tweet);
    }

}
