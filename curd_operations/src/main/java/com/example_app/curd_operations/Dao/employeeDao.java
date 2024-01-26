package com.example_app.curd_operations.Dao;


import com.example_app.curd_operations.Entity.Employee_Entity;
import org.springframework.data.repository.CrudRepository;

public interface employeeDao extends CrudRepository<Employee_Entity, Long>{

    Employee_Entity findByIdEmployeeEntity(Long id);
}
