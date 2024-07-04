package com.bacarat.livebacaratbackend.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "ROLE_USER")
public class RoleUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "ID_USER")
    private Users user;

    @ManyToOne
    @JoinColumn(name = "ID_ROLE")
    private Roles idRole;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public Roles getIdRole() {
        return idRole;
    }

    public void setIdRole(Roles idRole) {
        this.idRole = idRole;
    }
}
