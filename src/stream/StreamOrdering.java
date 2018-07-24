/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stream;

import static java.util.Arrays.asList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import static java.util.stream.Collectors.toList;

/**
 *
 * @author hnguyen
 */
public class StreamOrdering {

    public static void main(String[] args) {
        List<Integer> numbers = asList(2, 1, 3, 4);
        List<Integer> sameOrder = numbers.stream()
                .sorted()
                .collect(toList());

        sameOrder.forEach(System.out::println);

        //case2
        Set<Integer> numbers2 = new HashSet<>(asList(3, 4, 2, 1));
        List<Integer> sameOrder2 = numbers2.stream()
                .collect(toList());
        sameOrder2.forEach(System.out::println);

    }
}
