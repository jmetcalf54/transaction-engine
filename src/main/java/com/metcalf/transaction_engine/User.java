package com.metcalf.transaction_engine;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt;

    public User() {}

    public User(String email){
        this.email = email;
        this.createdAt = LocalDateTime.now();
    }

    public Long getId(){return id;}
    public String getEmail(){return email;}
    public LocalDateTime getCreatedAt(){return createdAt;}

}
