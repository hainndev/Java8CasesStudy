/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stream;

import java.util.stream.Stream;

/**
 *
 * @author hnguyen
 */
public class StreamReduce {

    public static void main(String[] args) {
        int count = Stream.of(1, 2, 3)
                .reduce(4, (acc, element) -> acc + element);
        
        System.out.println(count);
    }
}
