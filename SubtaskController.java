package com.example.demoNewa.Controller;

import com.example.demoNewa.entuty.Subtask;
import com.example.demoNewa.service.SubtaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/subtasks")
public class SubtaskController {
    @Autowired
    private SubtaskService subtaskService;

    @PostMapping
    public ResponseEntity<Subtask> createSubtask(@RequestBody Subtask subtask) {
        Subtask createdSubtask = subtaskService.createSubtask(subtask);
        return new ResponseEntity<>(createdSubtask, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteSubtask(@PathVariable Long id) {
        subtaskService.deleteSubtask(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}