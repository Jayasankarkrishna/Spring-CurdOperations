package com.example_app.curd_operations.Dao;

import com.example_app.curd_operations.Entity.Student;
import com.example_app.curd_operations.IDao.StudentIDao;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


// its supports component scanning and translates jdbc exceptions
@Repository
public class StudentDao implements StudentIDao {

    // define field for entity manager
    private EntityManager entityManager;

    //inject entity manager using constructor injection
    @Autowired
    public StudentDao(EntityManager entityManager) {
        this.entityManager = entityManager;
    }


    // implements save method
    @Override
    @Transactional  // add @Transcational since we are performance an update
    public void save(Student theStudent) {
        entityManager.persist(theStudent);
    }

    @Override
    public Student findById(Integer id) {
        return entityManager.find(Student.class, id);
    }

    @Override
    public List<Student> findAll() {                                //"FROM Student" or FROM Student order by lastName asc/desc  or
        TypedQuery<Student> theQuery = entityManager.createQuery("FROM Student WHERE id=1", Student.class);
        return theQuery.getResultList();
    }

    @Override
    public List<Student> getLastName() {
        TypedQuery<Student> theQuery=entityManager.createQuery("FROM Student WHERE lastName='ram'", Student.class);
        return  theQuery.getResultList();
    }

    @Override
    public List<Student> getFirstName() {
        TypedQuery<Student> theQuery=entityManager.createQuery("FROM Student WHERE firstName='jay'", Student.class);
       return  theQuery.getResultList();
    }

    @Override
    @Transactional
    public void updateId(Student theStudent) {
        entityManager.merge(theStudent);
    }

    @Override
    @Transactional
    public void Delete(Integer id) {
        // retrive the student
        Student thestudent=entityManager.find(Student.class,id);


        // delete the student
        entityManager.remove(thestudent);



    }


    //delete using query on apecific data
    @Override
    @Transactional
    public int deleteusingquery() {

        int number=entityManager.createQuery("DELETE FROM Student WHERE lastName = 'ram'").executeUpdate();

        return number;
    }


    // Delete all data using query
    @Override
    public int DeleteALL_DATA_USING_QUERY() {
        int number=entityManager.createQuery("DELETE FROM Student").executeUpdate();

        return number;
    }


    // set query  in parameters

////    public List<Student> getLastName(String theLastName) {        //FROM Student lastName=:latNameData
//        public List<Student> getLastName(){
//        TypedQuery<Student> theQueryl=entityManager.createQuery("FROM Student WHERE lastName='ram'", Student.class);
//
////        theQuery.setParameter("latNameData",theLastName);
    // return query result
//        return  theQueryl.getResultList();
//    }
//
//    @Override
//    public List<Student> getFirstName() {
//        TypedQuery<Student> theQueryf=entityManager.createQuery("FROM Student WHERE firstName='jay'", Student.class);
//        return  theQueryf.getResultList();
//
//    }

}
