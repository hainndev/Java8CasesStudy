/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author hnguyen
 */
public class ReturnPair {

    public static void main(String[] args) {
        List<Integer> n1 = Arrays.asList(1, 2, 3);
        List<Integer> n2 = Arrays.asList(3, 4);

        List<int[]> pair = n1.stream()
                .flatMap(i -> n2.stream().map(j -> new int[]{i, j}))
                .collect(Collectors.toList());
        
        for (int[] is : pair) {
            System.out.println(is[0] + ", " + is[1]);
        }
    }
}
