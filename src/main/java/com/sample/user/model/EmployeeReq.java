package com.sample.user.model;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.validation.annotation.Validated;

public class EmployeeReq {
    private String name;
    private Integer salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    private Department department;

}
