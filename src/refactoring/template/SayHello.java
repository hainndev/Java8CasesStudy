/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refactoring.template;

/**
 *
 * @author hnguyen
 */
public class SayHello extends OnlineBanking {

    @Override
    void makeCustomerHappy(Customer c) {
        System.out.println("Hello " + c.getName());
    }

}
