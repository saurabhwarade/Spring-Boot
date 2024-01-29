package com.example.SpringBootJPA.Service;

import com.example.SpringBootJPA.Dao.StudentDao;
import com.example.SpringBootJPA.Model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentDao studentDao;


    public void addStudent(Student student) {
        studentDao.save(student);
    }

    public List<Student> getAllDetail() {
        return (List<Student>) studentDao.findAll();
    }

    public void getStudentById(int id) {
        System.out.println(studentDao.findById(id));
        ;

    }

    public void deleteStudent(int id) {
        studentDao.deleteById(id);
    }

    public void deleteStudentObj(Student student) {
        studentDao.delete(student);
    }

    public void updateStudent(Student student) {
        studentDao.save(student);
    }

    public void countStudent() {
        System.out.println(studentDao.count());
    }

    public void studentExist(int id) {
        System.out.println(studentDao.existsById(id));
    }
}
