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
public class StreamMaxMin {

    public static void main(String[] args) {
        int min = Stream.of(5, 2, 3, 4, 5, 10).mapToInt(p -> p).min().getAsInt();
        System.out.println(min);
    }
}
