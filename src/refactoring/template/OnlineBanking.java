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
public abstract class OnlineBanking {

    public void processCustomer(Customer c) {
        //Do something
        
        //
        makeCustomerHappy(c);
    }

    abstract void makeCustomerHappy(Customer c);
}
