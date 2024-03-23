package com.example.demo.domain;


import com.example.demo.datatranferobject.AppUserResponse;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
public class AppUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String username;

    @Column
    private String password;

    @Column
    private Boolean active;

    @Column
    private LocalDateTime creationDate;

    @Column
    private LocalDateTime updateDate;

    @EqualsAndHashCode.Exclude
    @OneToMany(mappedBy = "author")
    private List<Task> tasks = Collections.emptyList();

    @EqualsAndHashCode.Exclude
    @ManyToMany(mappedBy = "users")
    private List<Role> roles = Collections.emptyList();

    public AppUser(Long id, String username, String password, Boolean active, LocalDateTime creationDate, LocalDateTime updateDate) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.active = active;
        this.creationDate = creationDate;
        this.updateDate = updateDate;
    }

    public AppUser(String username, String password, Boolean active, LocalDateTime creationDate, LocalDateTime updateDate) {
        this.username = username;
        this.password = password;
        this.active = active;
        this.creationDate = creationDate;
        this.updateDate = updateDate;
    }

    public AppUserResponse toDto() {
        return new AppUserResponse(
                getId(),
                getUsername(),
                getPassword(),
                getActive(),
                getCreationDate(),
                getUpdateDate(),
                getRoles()
        );
    }
}

