package com.sample.user.service;

import com.sample.user.model.EmployeeReq;
import com.sample.user.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements  EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public int add(EmployeeReq employeeReq) {
         employeeRepository.save(employeeReq);
         return 1;
    }

    @Override
    public List<EmployeeReq> getEmployee(Integer start, Integer end) {
        Page<EmployeeReq> employeeReqPage = employeeRepository.findAll(PageRequest.of(start,end));
      return employeeReqPage.toList();
    }

    @Override
    public List<EmployeeReq> searchByNameORSalary(String keyword) {
        keyword = "%" + keyword + "%";
       return employeeRepository.findByNameContaining(keyword);
    }
}
