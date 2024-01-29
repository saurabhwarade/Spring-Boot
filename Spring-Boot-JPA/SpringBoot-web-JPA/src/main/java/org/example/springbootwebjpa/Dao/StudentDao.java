package org.example.springbootwebjpa.Dao;

import org.example.springbootwebjpa.Model.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentDao extends CrudRepository<Student,Integer> {
}
