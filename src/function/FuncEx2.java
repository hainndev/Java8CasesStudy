/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 *
 * @author hnguyen
 */
public class FuncEx2 {
    public static void main(String[] args) {
        List<Integer> integers = map(Arrays.asList("hai", "java 8", "test"), (s) -> s.length());
        integers.forEach(p -> System.out.println(p));
    }
    
    public static <T, R> List<R> map(List<T> list, Function<T, R> f) {
        //list.stream().map(p -> f.apply(p)).collect(Collectors.toList());
        List<R> resutl = new ArrayList<>();
        list.forEach(p -> resutl.add(f.apply(p)));
        return resutl;
    }
}
