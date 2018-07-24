/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stream;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author hnguyen
 */
public class HelloWorld {

    public static void main(String[] args) {
        String[] arrayOfWords = {"Hello", "World"};
        Stream<String> streamOfwords = Arrays.stream(arrayOfWords);

        streamOfwords
                .map(p -> p.split(""))
                .flatMap(p -> Arrays.stream(p))
                .distinct()
                .collect(Collectors.toList())
                .forEach(System.out::println);

    }
}
