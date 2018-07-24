/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author hnguyen
 */
public class Practice {

    static Trader raoul = new Trader("Raoul", "Cambridge");
    static Trader mario = new Trader("Mario", "Milan");
    static Trader alan = new Trader("Alan", "Cambridge");
    static Trader brian = new Trader("Brian", "Cambridge");

    public static List<Transaction> transactions = Arrays.asList(
            new Transaction(brian, 2011, 500),
            new Transaction(raoul, 2012, 1000),
            new Transaction(raoul, 2011, 400),
            new Transaction(mario, 2012, 710),
            new Transaction(mario, 2012, 700),
            new Transaction(alan, 2012, 950)
    );

    public static void main(String[] args) {
        //case1();
        //case3();
        case2();
    }
    
    //Find all transactions in the year 2011 and sort them by value (small to high).
    public static void case1(){
        transactions.stream()
                .filter(p -> p.getYear() == 2011)
                .sorted(Comparator.comparing(Transaction::getValue))
                //.collect(Collectors.toList())
                .forEach(p -> System.out.println(p.getTrader().getName()));
    }
    
    //What are all the unique cities where the traders work?
    public static void case2(){
        transactions.stream()
                .map(p -> p.getTrader().getCity())
                .distinct()
                .forEach(System.out::println);
    }
    
    //Find all traders from Cambridge and sort them by name
    public static void case3(){
        transactions.stream()
                .map(Transaction::getTrader)
                .filter(p -> "Cambridge".equals(p.getCity()))
                .distinct()
                .sorted(Comparator.comparing(Trader::getName))
                .forEach(System.out::println);
    }
    //Return a string of all traders’ names sorted alphabetically
    public static void case4(){
       String s = transactions.stream()
                .map(p -> p.getTrader().getName())
                .distinct()
                .sorted()
                //.reduce("", (a, b) -> a + b);
                .collect(Collectors.joining());
       
        System.out.println(s);
    }
    
    //What’s the highest value of all the transactions?
    public static void case5(){
       int s = transactions.stream()
                .mapToInt(Transaction::getValue)
                .max()
                .orElse(0);
        System.out.println(s);
    }
    
    //Find the transaction with the smallest value
    public static void case6(){
       int s = transactions.stream()
                .mapToInt(Transaction::getValue)
                .max()
                .orElse(0);
        System.out.println(s);
    }
}
