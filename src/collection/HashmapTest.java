/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collection;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author hnguyen
 */
public class HashmapTest {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap();
        map.put(2, "BB");
        map.put(1, "CC");
        map.put(1, "AA");
        map.put(3, "DD");
        
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println( key +" - "+ value);
        }
    }
}
