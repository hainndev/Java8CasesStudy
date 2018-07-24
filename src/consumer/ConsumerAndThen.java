/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consumer;

import java.util.function.Consumer;

/**
 *
 * @author hnguyen
 */
public class ConsumerAndThen {

    public static void main(String[] args) {
        Consumer<String> consumerA = (str) -> System.out.println(str.toLowerCase());
        Consumer<String> consumerB = (str) -> System.out.println(str.toUpperCase());

        consumerA.accept("Test");
        
        consumerA.andThen(consumerB).accept("Hai");
    }
}
