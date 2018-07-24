/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import practice.Practice;
import practice.Transaction;

/**
 *
 * @author hnguyen
 */
public class GroupAndPatitioning extends Practice {

    public static void main(String[] args) {
        //groupTransactionByYear();
        //groupAndCount();
        //groupAndAvg();
        //patitioningTransction();
        patitioningAndGroup();
    }

    /*{
    2011=[
    {Trader:Brian in Cambridge, year: 2011, value:500}, 
    {Trader:Raoul in Cambridge, year: 2011, value:400}
    ], 
    2012=[
    {Trader:Raoul in Cambridge, year: 2012, value:1000}, 
    {Trader:Mario in Milan, year: 2012, value:710}, 
    {Trader:Mario in Milan, year: 2012, value:700}, 
    {Trader:Alan in Cambridge, year: 2012, value:950}]
    }
     */
    public static void groupTransactionByYear() {
        Map<Integer, List<Transaction>> transGroup = transactions.stream()
                .collect(Collectors.groupingBy(Transaction::getYear));

        System.out.println(transGroup);
    }

    /*
        {2011=2, 2012=4}
     */
    public static void groupAndCount() {
        Map<Integer, Long> transGroup = transactions.stream()
                .collect(Collectors.groupingBy(Transaction::getYear, Collectors.counting()));

        System.out.println(transGroup);
    }

    /*
        {2011=450.0, 2012=840.0}
     */
    public static void groupAndAvg() {
        Map<Integer, Double> transGroup = transactions.stream()
                .collect(Collectors.groupingBy(Transaction::getYear,
                        Collectors.averagingInt(Transaction::getValue)));

        System.out.println(transGroup);
    }

    /*
        {
    false=[{Trader:Brian in Cambridge, year: 2011, value:500}, {Trader:Raoul in Cambridge, year: 2012, value:1000}, {Trader:Raoul in Cambridge, year: 2011, value:400}, {Trader:Alan in Cambridge, year: 2012, value:950}], 
    true=[{Trader:Mario in Milan, year: 2012, value:710}, {Trader:Mario in Milan, year: 2012, value:700}]}
     */
    public static void patitioningTransction() {
        Map<Boolean, List<Transaction>> trans = transactions.stream()
                .collect(Collectors.partitioningBy(p -> "Milan".equals(p.getTrader().getCity())));

        System.out.println(trans);
    }

    /*
        {false={2011=2, 2012=2}, true={2012=2}}
     */
    public static void patitioningAndGroup() {
        Map<Boolean, Map<Integer, Long>> trans = transactions.stream()
                .collect(Collectors.partitioningBy(
                        p -> "Milan".equals(p.getTrader().getCity()),
                        Collectors.groupingBy(Transaction::getYear, Collectors.counting())
                ));

        System.out.println(trans);
    }
}
