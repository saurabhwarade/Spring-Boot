package com.example.SpringBootJPA.Dao;

import com.example.SpringBootJPA.Model.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentDao extends CrudRepository<Student,Integer> {
}
