package com.example.demoNewa.entuty;

import com.example.demoNewa.entuty.Task;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Date;

@Data
@Entity
@Table(name = "col2")
@AllArgsConstructor
@NoArgsConstructor

public class Subtask {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "task_id", nullable = false)
    private Task task;

    private int status;

    private Date createdAt;
    private Date updatedAt;
    private Date deletedAt;

}