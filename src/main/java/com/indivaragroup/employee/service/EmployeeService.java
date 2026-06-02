package com.indivaragroup.employee.service;

import com.indivaragroup.employee.model.Employee;

import java.util.Comparator;
import java.util.List;

public class EmployeeService {

    public void sortByName(List<Employee> employees) {
        employees.stream()
                .sorted(Comparator.comparing(employee -> employee.getName()))
                .forEach(System.out::println);
    }

    public void sortBySalary(List<Employee> employees) {
        employees.stream()
                .sorted(Comparator.comparing(employee -> employee.getSalary()))
                .forEach(System.out::println);
    }

    public void sortByCity(List<Employee> employees) {
        employees.stream()
                .sorted(Comparator.comparing(Employee::getAddress))
                .forEach(System.out::println);
    }

    public void countGender(List<Employee> employeeList) {
        long pria = employeeList.stream()
                .filter(employee -> employee.getGender() == 'L')
                .count();

        long wanita = employeeList.stream()
                .filter(employee -> employee.getGender() == 'P')
                .count();

        System.out.println("JUMLAH PRIA : " + pria);
        System.out.println("JUMLAH WANITA : " + wanita );
    }
}
