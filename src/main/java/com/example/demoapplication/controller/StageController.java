package com.example.demoapplication.controller;

import com.example.demoapplication.model.Stage;
import com.example.demoapplication.service.StageService;
import com.example.demoapplication.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/stages")
public class StageController {

    @Autowired
    private StageService stageService;

    @Autowired
    private StudentService studentService;

    // Liste des stages
    @GetMapping
    public String listStages(Model model) {
        model.addAttribute("stages", stageService.getAllStages());  // Ajout de l'attribut stages avec les stages récupérés du service
        return "stages_list";  // Vue stages_list.html
    }

    // Formulaire d'ajout d'un stage
    @GetMapping("/add")
    public String addStageForm(Model model) {
        model.addAttribute("stage", new Stage());  // Ajouter un objet Stage vide pour le formulaire
        model.addAttribute("students", studentService.getAllStudents());  // Ajouter la liste des étudiants à la vue
        return "add_stage";  // Vue add_stage.html
    }

    // Sauvegarder un stage
    @PostMapping("/add")
    public String saveStage(@ModelAttribute Stage stage) {
        stageService.saveStage(stage);  // Sauvegarder le stage via le service
        return "redirect:/stages";  // Redirection vers la liste des stages
    }
}
