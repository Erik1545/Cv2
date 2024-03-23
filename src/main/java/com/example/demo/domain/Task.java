package com.example.demo.domain;

import com.example.demo.datatranferobject.TaskResponse;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@Entity
public class Task {
    @Id
    private Long id;

    @Column
    private String title;

    @Column
    private String description;

    @Column
    private LocalDateTime creationDate;

    @Column
    private LocalDateTime updateDate;

    @ManyToOne
    @JoinColumn(name="author_id", nullable=false)
    @ToString.Exclude
    @JsonIgnore
    private AppUser author;

    public TaskResponse toDto(){
        return new TaskResponse(
                getId(),
                getTitle(),
                getDescription(),
                getCreationDate(),
                getUpdateDate()
        )
    }
}
