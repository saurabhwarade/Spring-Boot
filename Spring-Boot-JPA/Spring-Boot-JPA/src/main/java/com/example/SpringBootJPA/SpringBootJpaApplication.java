package com.example.SpringBootJPA;

import com.example.SpringBootJPA.Controller.StudentController;
import com.example.SpringBootJPA.Model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootJpaApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(SpringBootJpaApplication.class, args);
        StudentController controller = context.getBean(StudentController.class);

        //Save student in database by using save method
        controller.addStudent(Student.builder()
                .id(2)
                .name("pratik")
                .phone("2345")
                .address("mumbai")
                .email("pratik@gmail.com").build());

        //get student detail by id
        controller.getStudentById(7);

        //delete student by id using delete method
        controller.deleteStudent(3);

        //update record using save method
        controller.updateStudnet(Student.builder()
                .id(2)
                .name("saurabh")
                .phone("23456")
                .address("pune")
                .email("saurabh@gmail.com").build());

        //delete object using id
        // controller.delteStudentObj(student);

        //count the object in the database
        controller.countStudent();

        //get All record
        controller.getAllDetail().forEach(System.out::println);

        //object is exist in database or not true/false
        controller.studentExist(2);
    }

}
