package com.example.demoapplication.service;

import com.example.demoapplication.model.Stage;
import com.example.demoapplication.repository.StageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StageService {
    @Autowired
    private StageRepository stageRepository;

    public List<Stage> getAllStages() {
        return stageRepository.findAll();
    }

    public void saveStage(Stage stage) {
        stageRepository.save(stage);
    }
}
