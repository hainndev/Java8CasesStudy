/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author hnguyen
 */
public class StreamFilter {

    public static void main(String[] args) {
     List<String> s =  Stream.of("a", "1abc", "abc1")
               .filter(p -> {
                   System.out.println("Filter: "+ p);
                   return p.contains("1");
               }).map(p -> {
                   System.out.println("Map: "+ p);
                   return p.toUpperCase();
               }).limit(1)
               .collect(Collectors.toList());
               //.forEach(p -> System.out.println(p));
               
               System.out.println("s="+s);
    }
}
