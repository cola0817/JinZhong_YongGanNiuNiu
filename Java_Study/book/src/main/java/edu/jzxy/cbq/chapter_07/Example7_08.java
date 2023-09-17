package edu.jzxy.cbq.chapter_07;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author Cola0817
 * @name Example7_08
 * @date 2023/9/17 11:41
 * @since 1.0.0
 */
public class Example7_08 {
    public static void main(String[] args) {
        /**
         * 将员工按年龄从大到小排序，如果年龄相同，则按员工号从小到大排序
         * 排序后输出员工信息
         */
        Employee cola = new Employee(1, "Cola", 21, 100.0);
        Employee rhf = new Employee(2, "RHF", 22, 200.0);
        Employee rh = new Employee(3, "RH", 23, 300.0);
        Employee[] employees = {cola, rhf, rh};
        Arrays.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                if (o1.getAge() != o2.getAge()){
                    return o2.getAge() - o1.getAge();
                }else {
                    return o1.getId().compareTo(o2.getId());
                }
            }
        });
        System.out.println("通过 Comparator 进行比较");
        for (Employee employee : employees) {
            System.out.println(employee);
        }

        System.out.println("通过 lambda 进行比较");
        Arrays.sort(employees,((o1, o2) -> {
            if (o1.getAge() != o2.getAge()){
                return o2.getAge() - o1.getAge();
            }else {
                return o1.getId().compareTo(o2.getId());
            }
        }));
        for (Employee employee : employees) {
            System.out.println(employee);
        }
        System.out.println("使用静态比较器进行比较");
        Arrays.sort(employees, Comparator.comparingInt(Employee::getAge).reversed().thenComparing(Employee::getId));
        for (Employee employee : employees) {
            System.out.println(employee);
        }

    }
}
