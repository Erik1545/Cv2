package com.example.demo.service;


import com.example.demo.repository.TaskRepository;
import lombok.AllArgsConstructor;
import org.springframework.scheduling.config.Task;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class TaskService {
    private TaskRepository taskRepository;

    public List<Task> findAllByAuthorId(final Long authorId) {
        return taskRepository.findAllByAuthorId(authorId);
    }
}
