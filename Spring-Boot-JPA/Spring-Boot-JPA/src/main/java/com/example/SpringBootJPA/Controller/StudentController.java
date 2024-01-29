package com.example.SpringBootJPA.Controller;

import com.example.SpringBootJPA.Model.Student;
import com.example.SpringBootJPA.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class StudentController {

    @Autowired
    StudentService studentService;

    public void addStudent(Student student) {

        studentService.addStudent(student);
    }

    public List<Student> getAllDetail() {
        return studentService.getAllDetail();
    }

    public void getStudentById(int id) {
        studentService.getStudentById(id);
    }

    public void deleteStudent(int id) {
        studentService.deleteStudent(id);
    }

    public void deleteStudentObj(Student student) {
        studentService.deleteStudentObj(student);
    }

    public void updateStudnet(Student student) {
        studentService.updateStudent(student);
    }

    public void countStudent() {
        studentService.countStudent();
    }

    public void studentExist(int id) {
        studentService.studentExist(id);
    }
}
