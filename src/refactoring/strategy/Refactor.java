/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refactoring.strategy;

/**
 *
 * @author hnguyen
 */
public class Refactor {

    public static void main(String[] args) {
        Validator validator = new Validator(new IsNumeric());
        boolean isNumber = validator.validate("123");
        System.out.println("isNumber: " + isNumber);

        //refactoring
        Validator validatorLamda = new Validator(s -> s.matches("\\d+"));
        System.out.println("isNumber Lamda: " + validatorLamda.validate("123"));
    }
}
