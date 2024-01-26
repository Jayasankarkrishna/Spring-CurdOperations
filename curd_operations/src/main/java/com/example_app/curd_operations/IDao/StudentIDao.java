package com.example_app.curd_operations.IDao;

import com.example_app.curd_operations.Entity.Student;

import java.util.List;

public interface StudentIDao {

    void save(Student theStudent);

    Student findById(Integer id);

    List <Student> findAll();

    List<Student> getLastName();

    List<Student> getFirstName();

    void updateId(Student theStudent);

    void Delete(Integer id);

    int deleteusingquery();


    int DeleteALL_DATA_USING_QUERY();


}
