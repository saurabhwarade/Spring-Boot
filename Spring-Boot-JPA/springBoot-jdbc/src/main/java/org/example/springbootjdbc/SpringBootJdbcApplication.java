package org.example.springbootjdbc;

import org.example.springbootjdbc.Dao.CourseDao;
import org.example.springbootjdbc.Model.Course;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringBootJdbcApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SpringBootJdbcApplication.class, args);
        CourseDao courseDao = context.getBean(CourseDao.class);
        List<Course> allCourses = courseDao.getAllCourses();
        allCourses.forEach(System.out::println);
      //  courseDao.addCourse(Course.builder().id(3).Price(123).course_Name("python").build());
        Course courseById = courseDao.getCourseById(2);
        System.out.println(courseById);

    }

}
