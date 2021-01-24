package com.sample.user.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository<EmployeeReq> extends CrudRepository<EmployeeReq, Long> {

    // fetching distinct emp and salary should be positive(validation)
    @Query(value= "select distinct emp from employee emp where emp.salary > 0 ", nativeQuery = true)
    Page<EmployeeReq> findAll(Pageable pageable);

    //search by name or salary if matching
    @Query(value = "select emp from employee emp where emp.name like :searchValue  or emp.salary like :searchValue ", nativeQuery = true)
    List<EmployeeReq>  findByNameContaining(@Param("searchValue")String searchValue);
}
