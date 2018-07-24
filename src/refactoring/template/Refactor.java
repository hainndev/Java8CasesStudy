/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refactoring.template;

import java.util.function.Consumer;

/**
 *
 * @author hnguyen
 */
public class Refactor {

    public static void main(String[] args) {
        OnlineBanking onlineBanking = new SayHello();
        onlineBanking.processCustomer(new Customer("Hai", 1));

        //Refactoring
        refactoringOnlineBanking(new Customer("Hai 2", 1) , c -> System.out.println("Hello "+ c.getName()));
    }

    public static void refactoringOnlineBanking(Customer customer, Consumer<Customer> consumer) {
        //Do some thing
        //
        consumer.accept(customer);
    }
}
