package com.indivaragroup.employee;

        /*
        ada 2 kelas objek
        - pegawai : nama, alamat, gaji, gender (L dan P)
        - main class ada 10 data isinya kota dsbnya
        - buatin function sorting berdasarkan nama (ascending A - Z)
        - buatin function sorting berdasarkan jenis kelamin, counting pria sama wanita
        - buatin function sorting berdasarkan kota
        - buatin function sorting urutan gaji ascending
         */

import com.indivaragroup.employee.data.EmployeeData;
import com.indivaragroup.employee.model.Employee;
import com.indivaragroup.employee.service.EmployeeService;
import com.indivaragroup.employee.service.EmployeeServiceConventional;

import java.util.List;

public class EmployeeMain {
    public static void main(String[] args) {
        List<Employee> employees = EmployeeData.getEmployee();

        // modern
        EmployeeService service = new EmployeeService();

        // conventional
        EmployeeServiceConventional serviceTwo = new EmployeeServiceConventional();

        System.out.println("SORT BY NAME");
//        service.sortByName(employees);
        serviceTwo.sortByName(employees);

        System.out.println("\nSORT BY KOTA");
//        service.sortByCity(employees);
        serviceTwo.sortByCity(employees);

        serviceTwo.countCity(employees);

        System.out.println("\nSORT BY SALARY");
//        service.sortBySalary(employees);
        serviceTwo.sortBySalary(employees);

        System.out.println("\nCOUNT GENDER");
//        service.countGender(employees);
        serviceTwo.countGender(employees);
    }
}
