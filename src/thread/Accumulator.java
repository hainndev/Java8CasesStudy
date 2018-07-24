/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread;

import java.util.concurrent.atomic.AtomicLong;

/**
 *
 * @author hnguyen
 */
public class Accumulator {

    public AtomicLong total = new AtomicLong();

    public void add(long value) {
        
        total.addAndGet(value);
        //total += value;
    }

}
