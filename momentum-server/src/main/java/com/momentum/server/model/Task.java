package com.momentum.server.model;
import com.momentum.server.model.enums.TaskPriority;
import java.time.LocalDateTime;
import java.util.UUID;
import jakarta.persistence.Column;
import jakarta.persistence.Table;
import jakarta.persistence.EnumType;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Table(name = "tasks")
@Data
public class Task {
    @Id
    private UUID id;
    @Column (name = "user_id")
    private UUID userId;
    private String title;
    private String description;
    private String category;
    @Enumerated (EnumType.STRING)
    private TaskPriority priority;
    @Column (name = "is_active")
    private boolean isActive;
    @Column (name = "created_at")
    private LocalDateTime createdAt;
}