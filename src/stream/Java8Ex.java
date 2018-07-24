/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stream;

import java.text.NumberFormat;
import java.util.Locale;

/**
 *
 * @author hnguyen
 */
public class Java8Ex {
private static final NumberFormat CURRENCY_FORMATTER = NumberFormat.getInstance(Locale.US);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double currencyAmount = 9876543.21; //Default is BigDecimal
        
        System.out.println(CURRENCY_FORMATTER.format(currencyAmount));

    }
    
}
