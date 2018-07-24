/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 *
 * @author hnguyen
 */
public class TestConsumer {

    public static void main(String[] args) {
    List<Student> students = Arrays.asList(
        new Student("Hai", 3),
        new Student("Nga", 4));

    loopThroughStudents(students, student -> System.out.println(student.getName()));
    loopThroughStudents(students, student -> student.setGpa(student.getGpa() * 1.5));
    loopThroughStudents(students, System.out::println);
  }

  public static void loopThroughStudents(List<Student> students, Consumer<Student> consumer) {
      students.stream().forEach((student) -> {
          consumer.accept(student);
        });
  }
}
