package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Student;
import com.app.repositories.StudentRepository;

@RestController
@RequestMapping("students")
public class Controller {

	@Autowired
    private StudentRepository studentRepository;
	
	@PostMapping("student")
    public String createStudent(@RequestParam String name) {
        studentRepository.save(new Student(name, "Ucla unversity"));
        String nameToReturn = studentRepository.findByName(name);
        return studentRepository.findByName(name) + " Saved successfully";
    }

    @GetMapping("student")
    public List<Student> getAllStudents() {
        return (List<Student>) studentRepository.findAll();
    }
}
