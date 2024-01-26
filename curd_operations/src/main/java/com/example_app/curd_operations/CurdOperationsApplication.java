package com.example_app.curd_operations;

import com.example_app.curd_operations.Dao.StudentDao;
import com.example_app.curd_operations.Entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CurdOperationsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurdOperationsApplication.class, args);
	}


//	@Bean
//	public CommandLineRunner commandLineRunner(StudentDao studentDAo) {
//
//		return runner -> {
//			createMultipleStudent(studentDAo);
//			readStudent(studentDAo);
//			QueryForStudent(studentDAo);
//			QueryLastName(studentDAo);
//			QueryfirstName(studentDAo);
//			UpdateIdData(studentDAo);
//			DeleteByUsingId(studentDAo);
//			DeleteUsingQuerySpicficData(studentDAo);
//		};
//	}

//	private void createMultipleStudent(StudentDao studentDAo) {
//		Student temp=new Student("jay" ,"raj","jayram@gmail.com");
//		Student temp2=new Student("jay" ,"raj","jayram@gmail.com");
//		Student temp3=new Student("jay" ,"raj","jayram@gmail.com");
//
//		studentDAo.save(temp);
//		studentDAo.save(temp2);
//		studentDAo.save(temp3);
//
//	}

//	private void createStudent(StudentDao studentDAo) {
//		System.out.println("creating new student objects ...");
//		Student temp=new Student("jay" ,"raj","jayram@gmail.com");
//
//		// saving the student object
//		studentDAo.save(temp);
//
//		//display id of the saved student
//		System.out.println("saved student generated is: " + temp.getId());
//	}

//	private void DeleteUsingQuerySpicficData(StudentDao studentDAo) {
//		int num=studentDAo.deleteusingquery();
//		System.out.println("DeleteUsingQuerySpicficData : "+ num);
//	}

//	private void DeleteByUsingId(StudentDao studentDAo) {
//
//		System.out.println("id given : "  + 1);
//		studentDAo.Delete(1);
//	}


	// Update data

//	private void UpdateIdData(StudentDao studentDAo) {
//
//		// retrive student based on the id: primary key
//
//		int StudentId=1;
//		System.out.println("my id number : " + StudentId);
//	Student mystudent=studentDAo.findById(StudentId);
//
//		// change first name to "scobby"
//mystudent.setFirstName("scobby");
//
//		System.out.println("update a student " + mystudent);
//
//		// update the student
//studentDAo.updateId(mystudent);
//		// display the update student
//		System.out.println("update a student " + mystudent);
//	}



















//	private void QueryfirstName(StudentDao studentDAo) {
//
//		List<Student> theStudent=studentDAo.getFirstName();
//
//		for(Student tempStudent : theStudent){
//			System.out.println(tempStudent);
//		}
//	}


//	private void QueryForStudent(StudentDao studentDAo) {
//
//		List<Student> theStudent=studentDAo.findAll();
//
//
//		for(Student tempStudent : theStudent){
//			System.out.println(tempStudent);
//		}
//	}


//	private void createmultipleStudent_read_also_okay(StudentDao studentDAo) {
//
//		// create the student object
//		System.out.println("creating new student object...");
//		Student tempstudent= new Student("jay","ram",  " jayram@gmail.com");
//		Student tempstudent1= new Student("raj","ram",  " rajram@gmail.com");
//		Student tempstudent2= new Student("sai","ram",  " sairam@gmail.com");
//		Student tempstudent3= new Student("sankar","ram",  " sankarram@gmail.com");
//
//		// save the student object
//		System.out.println("save the object");
//		studentDAo.save(tempstudent);
//		studentDAo.save(tempstudent1);
//		studentDAo.save(tempstudent2);
//		studentDAo.save(tempstudent3);
//
//
//		int tid =tempstudent.getId();
//		// display id of the saved student
//
//		System.out.println("diplay the id = " + tid);
//
//		// retrive data student based on the Id :  primary key
//		System.out.println("retrive the student id  = " + tid);
//
//
//		Student mystudent=studentDAo.findById(tid);
//
//		System.out.println("found student :" + mystudent);
////		Student firstname=studentDAo.findByName(tempstudent2.getFirstName());
////		Student lastname=studentDAo.finBylastname(tempstudent2.getLastName());
////
////		System.out.println("retrive the student id  = " + tempstudent.getFirstName());
////		System.out.println("retrive the student id  = " + tempstudent.getLastName());
//
//
//
//	}
}



