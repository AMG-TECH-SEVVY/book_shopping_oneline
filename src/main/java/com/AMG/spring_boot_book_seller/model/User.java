package com.AMG.spring_boot_book_seller.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "users")// don't use user because user is reserved name by PostgresSQL.

// craation d'un user a partir de ide
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

@Column(name = "username", unique = true, nullable = false, length = 100)
    private String username;

@Column(name="password", nullable = false, length = 100)
    private String password;
@Column(name = "name", nullable = false, length = 100)
    private String name;
@Column(name = "create_time", nullable = false)
    private LocalDateTime createtime;
//role
    @Enumerated(EnumType.STRING)
    @Column(name="role", nullable = false)
    private Role role;


}
