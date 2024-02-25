package com.main;

import java.util.*;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        Employee emp1 = new Employee(123, "Chandra",1234.00,26,new Date(), "M");
        Employee emp2 = new Employee(124, "Sonia",1236.00,24,new Date(), "F");
        Employee emp3 = new Employee(125, "Sathwik",1232.50,9,new Date(), "M");
        Employee emp4 = new Employee(126, "Trisha",11000.00,40,new Date(), "F");
        Employee emp5 = new Employee(127, "Anushka",15000.00,42,new Date(), "F");
        Employee emp6 = new Employee(128, "Krishna",1100.00,23,new Date(), "M");
        List<Employee> employees = new ArrayList<>();
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        employees.add(emp4);
        employees.add(emp5);
        employees.add(emp6);
        Map<String, Long> collect = employees.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
        System.out.println(collect);
        Map<String, Double> collect2 = employees.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getSalary)));
        System.out.println(collect2);
    }
}


class Employee {
    private Integer id;
    private String name;
    private Double salary;
    private Integer age;
    private Date dob;
    private String gender;

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Employee(Integer id, String name, Double salary, Integer age, Date dob, String gender) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.age = age;
        this.dob = dob;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }
}
