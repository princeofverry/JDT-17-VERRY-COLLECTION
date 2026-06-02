package com.indivaragroup.employee.service;

import com.indivaragroup.employee.model.Employee;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

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

    public void countCity(List<Employee> employeeList) {
        Map<String, Long> cityCount = employeeList.stream()
                .collect(Collectors.groupingBy(
                        employee -> employee.getAddress(),
                        Collectors.counting()
                ));

        cityCount.forEach((city, count) -> System.out.println(city + " : " + count));
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
