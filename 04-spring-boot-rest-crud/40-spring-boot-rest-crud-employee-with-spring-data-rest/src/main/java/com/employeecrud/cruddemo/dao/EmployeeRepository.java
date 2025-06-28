package com.employeecrud.cruddemo.dao;

import com.employeecrud.cruddemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

//  @RepositoryRestResource(path="members")
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    // that's it ... no need to write any code LOL!
}
