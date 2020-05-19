package com.rashmi.jpa.practice.controller;


import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rashmi.jpa.practice.entity.Student;
import com.rashmi.jpa.practice.service.StudentService;

@Controller
@RequestMapping("/student")
public class HomeController {
	
	private static final Logger LOG = LoggerFactory.getLogger(HomeController.class);

    @Autowired
    private StudentService studentService;

    @GetMapping("/list")
    public String listCustomers(Model model) {
        List < Student > studentList = studentService.getStudent();
        model.addAttribute("studentList", studentList);
        return "student_list";
    }

    @GetMapping("/showForm")
    public String showFormForAdd(Model model) {
        LOG.debug("inside show student-form handler method");
        Student student = new Student();
        model.addAttribute("student", student);
        return "student_form";
    }

    @PostMapping("/saveStudent")
    public String saveCustomer(@ModelAttribute("student") Student std) {
      studentService.saveCustomer(std);
        return "redirect:/student/list";
    }

}
