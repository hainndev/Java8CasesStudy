/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author hnguyen
 */
public class TestPredicate {
    public static void main(String[] args) {
        Employee e1 = new Employee(1, 23, "M");
        Employee e2 = new Employee(2, 13, "F");
        Employee e3 = new Employee(3, 43, "M");
        Employee e4 = new Employee(4, 26, "M");
        Employee e5 = new Employee(5, 19, "F");
        Employee e6 = new Employee(6, 15, "M");
        Employee e7 = new Employee(7, 68, "F");
        Employee e8 = new Employee(8, 79, "M");
        Employee e9 = new Employee(9, 15, "F");
        Employee e10 = new Employee(10, 45, "M");

        List<Employee> employeeList = new ArrayList<>();
        employeeList.addAll(Arrays.asList(new Employee[] { e1, e2, e3, e4, e5, e6, e7, e8, e9, e10 }));

        System.out.println(EmployeePredicate.filterEmployees(employeeList, EmployeePredicate.isAdultMale()));

        System.out.println(EmployeePredicate.filterEmployees(employeeList, EmployeePredicate.isAdultFemale()));

        System.out.println(EmployeePredicate.filterEmployees(employeeList, EmployeePredicate.isAgeMoreThan(35)));

        System.out.println(EmployeePredicate.filterEmployees(employeeList, EmployeePredicate.isAgeMoreThan(35).negate()));
    }
}
