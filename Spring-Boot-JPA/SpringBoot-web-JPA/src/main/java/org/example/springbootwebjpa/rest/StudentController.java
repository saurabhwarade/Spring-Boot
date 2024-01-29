package org.example.springbootwebjpa.rest;

import org.example.springbootwebjpa.Model.Student;
import org.example.springbootwebjpa.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController {

    @Autowired
    StudentService studentService;


    @RequestMapping(value = "/student")
    public ModelAndView addStudent (@ModelAttribute Student student){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("greeting");
        modelAndView.addObject("data","good morning");
        return modelAndView;
    }
}
