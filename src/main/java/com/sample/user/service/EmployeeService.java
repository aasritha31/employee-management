package com.sample.user.service;

import com.sample.user.model.EmployeeReq;

import java.util.List;

public interface EmployeeService {

    public int add(EmployeeReq employeeReq);

    public List<EmployeeReq>  getEmployee(Integer start, Integer end);

    public List<EmployeeReq> searchByNameORSalary(String keyword);
}
