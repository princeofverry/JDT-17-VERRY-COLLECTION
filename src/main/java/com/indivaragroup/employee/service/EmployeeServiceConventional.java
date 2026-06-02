package com.indivaragroup.employee.service;

import com.indivaragroup.employee.model.Employee;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeServiceConventional {
    private void printEmployees(List<Employee> employees) {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public void sortByName(List<Employee> employees) {
        for(int i = 0; i < employees.size() - 1; i++ ) {
            for(int j = 0; j < employees.size() - 1 - i; j++) {

                if (employees.get(j).getName()
                        .compareToIgnoreCase(employees.get(j + 1).getName()) > 0) {

                    Employee temp = employees.get(j);
                    employees.set(j, employees.get(j + 1));
                    employees.set(j + 1, temp);
                }
            }
        }
        printEmployees(employees);
    }

    public void sortBySalary(List<Employee> employees) {
        for(int i = 0; i < employees.size() - 1; i++) {
            for(int j = 0; j < employees.size() - 1 - i; j++) {

                if(employees.get(j).getSalary() <
                employees.get(j + 1).getSalary()) {
                    Employee temp = employees.get(j);
                    employees.set(j, employees.get(j + 1));
                    employees.set(j + 1, temp);
                }
            }
        }

        printEmployees(employees);
    }

    public void sortByCity(List<Employee> employees) {
        for (int i = 0; i < employees.size() - 1; i++) {
            for (int j = 0; j < employees.size() - 1 - i; j++) {

                if (employees.get(j).getAddress()
                        .compareToIgnoreCase(employees.get(j + 1).getAddress()) > 0) {

                    Employee temp = employees.get(j);
                    employees.set(j, employees.get(j + 1));
                    employees.set(j + 1, temp);
                }
            }
        }

        printEmployees(employees);
    }

    public void countCity(List<Employee> employees) {
        Map<String, Integer> cityCount = new HashMap<>();

        for(Employee employee : employees) {
            String city = employee.getAddress();
            if(cityCount.containsKey(city)) {
                cityCount.put(city, cityCount.get(city) + 1);
            } else {
                cityCount.put(city, 1);
            }
        }

        for(Map.Entry<String, Integer> entry : cityCount.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    public void countGender(List<Employee> employeeList) {
        int pria = 0;
        int wanita = 0;

        for (Employee employee : employeeList) {
            if (employee.getGender() == 'L') {
                pria++;
            } else if (employee.getGender() == 'P') {
                wanita++;
            }
        }

        System.out.println("JUMLAH PRIA   : " + pria);
        System.out.println("JUMLAH WANITA : " + wanita);
    }
}
