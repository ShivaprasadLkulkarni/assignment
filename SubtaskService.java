package com.example.demoNewa.service;

import com.example.demoNewa.entuty.Subtask;
import com.example.demoNewa.repo.SubtaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class SubtaskService {
    @Autowired
    private SubtaskRepository subtaskRepository;

    public Subtask createSubtask(Subtask subtask) {
        return subtaskRepository.save(subtask);
    }

    public void deleteSubtask(Long id) {
        subtaskRepository.deleteById(id);
    }
}
