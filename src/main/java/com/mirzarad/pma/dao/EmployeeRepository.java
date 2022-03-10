package com.mirzarad.pma.dao;

import org.springframework.data.repository.CrudRepository;
import com.mirzarad.pma.entities.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long>{

}
