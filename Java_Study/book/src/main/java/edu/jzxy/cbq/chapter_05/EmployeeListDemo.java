package edu.jzxy.cbq.chapter_05;

import java.util.Random;

/**
 * @author Cola0817
 * @name EmployeeListDemo
 * @date 2023/9/16 16:56
 * @since 1.0.0
 */
public class EmployeeListDemo {
    public static void main(String[] args) {
        Employee[] employees = new Employee[]{
            new Employee(1, "Cola", 21, "admin"),
            new Employee(2, "RHF", 22, "user"),
            new Employee(3, "RH", 23, "user")

        };

        for (Employee employee : employees) {
            System.out.println("employee = " + employee);
        }
    }
}
