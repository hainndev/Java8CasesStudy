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
public class StreamGenerate {

    public static void main(String[] args) {
        Stream.generate(Math::random)
                .limit(5).forEach(System.out::println);
    }
}
