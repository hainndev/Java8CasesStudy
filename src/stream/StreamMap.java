/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stream;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author hnguyen
 */
public class StreamMap {

    public static void main(String[] args) {
        String s = Stream.of("a", "b", "hello")
                .map(string -> string.toUpperCase())
                .collect(Collectors.joining(","));
        
        System.out.println(s);
    }
}
