package edu.jzxy.cbq.entity;

/**
 * @author Cola0817
 * @name Employee
 * @date 2023/9/15 16:27
 * @since 1.0.0
 */
public class Employee {
    private Integer empId;

    private String empName;

    private Double empSalary;

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Double getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(Double empSalary) {
        this.empSalary = empSalary;
    }

    @Override
    public String toString() {
        return "Employee{" +
            "empId=" + empId +
            ", empName='" + empName + '\'' +
            ", empSalary=" + empSalary +
            '}';
    }
}
