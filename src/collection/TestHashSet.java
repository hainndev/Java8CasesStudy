/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collection;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author hnguyen
 */
public class TestHashSet {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("c");
        set.add("a");
        set.add("a");
        set.add(null);
        
        set.forEach(p -> System.out.println(p));
        
        Set<Integer> set2 = new HashSet<>();
        set2.add(5);
        set2.add(4);
        set2.add(3);
        set2.add(2);
        set2.add(2);
        set2.add(6);
        
        set2.forEach(p -> System.out.println(p));
        
    }
}
