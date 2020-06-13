package com.assignment.demo.first;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Employee {

  private String firstName;
  private String lastName;
  private int age;

  public Employee(String firstName, String lastName, int age) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
  }

  public static void main(String[] args) {

    List<Employee> employees = new ArrayList<>();
    employees.add(new Employee("Elon", "Musk", 37));
    employees.add(new Employee("Bill", "Gates", 67));
    employees.add(new Employee("Brad", "Pitt", 47));
    employees.add(new Employee("Jade", "Smith", 19));
    System.out.println(getSortedEmployees(employees));
  }


  /**
   * This is the actual solution method The minimum age local variable declared is a effective final
   * variable as there is no final keyword is used and we have used it lambda filter
   *
   * @param employees
   * @return
   */
  public static List<Employee> getSortedEmployees(List<Employee> employees) {

    //Effective final variable
    int minimumAge = 26;
    return employees.stream()
        .filter(employee -> employee.age > minimumAge)
        .sorted((e1, e2) -> e1.getFirstName().compareTo(e2.firstName))
        .collect(Collectors.toList());

  }


  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  @Override
  public String toString() {
    return firstName + " " + lastName + " " + age;
  }
}
