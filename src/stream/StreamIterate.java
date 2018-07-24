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
public class StreamIterate {

    public static void main(String[] args) {
        //Fibonacci();
        SoChinhPhuong();
    }
    
    public static void SoChinhPhuong(){
        Stream.iterate(1, t -> t + 1)
                .filter(t -> Math.sqrt(t) == (int)Math.sqrt(t))
                .limit(10)
                .forEach(System.out::println);
    }

    public static void Fibonacci() {
        Stream.iterate(new int[]{0, 1},
                t -> new int[]{t[1], t[0] + t[1]})
                .limit(10)
                .map(t -> t[0]).forEach(System.out::println);
    }
}
