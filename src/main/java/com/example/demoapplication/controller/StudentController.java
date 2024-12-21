package com.example.demoapplication.controller;

import com.example.demoapplication.model.Student;
import com.example.demoapplication.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    // Afficher la liste des étudiants
    @GetMapping
    public String listStudents(Model model) {
        model.addAttribute("students", studentService.getAllStudents());  // Assurez-vous que la méthode getAllStudents existe dans votre service
        return "students_list";  // Vue students_list.html
    }

    // Afficher le formulaire d'ajout d'un étudiant
    @GetMapping("/add")
    public String addStudentForm(Model model) {
        model.addAttribute("student", new Student());  // Créer un nouvel objet Student pour le formulaire
        return "add_student";  // Vue add_student.html
    }

    // Sauvegarder un étudiant après l'ajout
    @PostMapping("/add")
    public String saveStudent(@ModelAttribute Student student) {
        studentService.saveStudent(student);  // Sauvegarder l'étudiant dans la base de données
        return "redirect:/students";  // Rediriger vers la liste des étudiants
    }
}
