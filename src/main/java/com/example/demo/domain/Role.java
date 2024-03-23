package com.example.demo.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Role {
    @Id
    private Long id;

    @Column
    private String name;

    @ManyToMany
    @JoinTable(name = "app_user_role", joinColumns = @JoinColumn(name = "role_id"), inverseJoinColumns = @JoinColumn(name = "app_user_id"))

    @ToString.Exclude
    @JsonIgnore
    private List<AppUser> users = Collections.emptyList();

}
