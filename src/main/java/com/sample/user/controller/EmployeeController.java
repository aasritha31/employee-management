package com.sample.user.controller;

import com.sample.user.model.EmployeeReq;
import com.sample.user.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping(value = "", method= RequestMethod.POST)
    public ResponseEntity<?> addEmployee(@RequestBody EmployeeReq employeeReq) {
       return new ResponseEntity<>(employeeService.add(employeeReq), HttpStatus.CREATED);
    }
    
    @RequestMapping(value = "", method = RequestMethod.GET)
    public ResponseEntity<?> getAllEmployee(@RequestParam("start") Integer start, @RequestParam("end") Integer end) {
        return new ResponseEntity<>(employeeService.getEmployee(start, end), HttpStatus.OK);
    }

    @RequestMapping(value="/search", method = RequestMethod.GET)
    public ResponseEntity<?> searchByNameORSalary(@RequestParam("searchValue") String searchValue) {
     return new ResponseEntity<>(employeeService.searchByNameORSalary(searchValue), HttpStatus.OK);
    }
}
