package com.example_app.curd_operations.Service;

import com.example_app.curd_operations.Dao.employeeDao;
import com.example_app.curd_operations.Dto.EmployeeDto;
import com.example_app.curd_operations.Entity.Employee_Entity;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class Employee_Service {

    @Autowired
    employeeDao EmployeeDao;

    public EmployeeDto getFindById(Long id){

        Employee_Entity Employee = EmployeeDao.findByIdEmployeeEntity(id);

        return new EmployeeDto();
    }
}

