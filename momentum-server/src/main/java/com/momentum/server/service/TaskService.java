package com.momentum.server.service;
import com.momentum.server.model.Task;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.*;
import com.momentum.server.repository.TaskRepository;
import org.springframework.stereotype.Service;

@Service
public class TaskService {
    @Autowired
    private TaskRepository taskRepository;
    public Task createTask (Task task) {
        return taskRepository.save(task);
    }

    public List<Task> getUserTasks(UUID userId) {
        return taskRepository.findByUserId(userId);
    }
}
