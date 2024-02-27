package com.example.demo.cv3;

import com.example.demo.cv3.AppUser;
import com.example.demo.cv3.Role;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "app_user_role")
public class AppUserRole {

    @Id
    @ManyToOne
    @JoinColumn(name = "app_user_id")
    private AppUser appUser;

    @Id
    @ManyToOne
    @JoinColumn(name = "role_id")
    private Role role;

    // Konstruktory, Gettery a Settery

    public AppUserRole() {
        // prázdný konstruktor pro JPA
    }

    public AppUserRole(AppUser appUser, Role role) {
        this.appUser = appUser;
        this.role = role;
    }

    public AppUser getAppUser() {
        return appUser;
    }

    public void setAppUser(AppUser appUser) {
        this.appUser = appUser;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}

