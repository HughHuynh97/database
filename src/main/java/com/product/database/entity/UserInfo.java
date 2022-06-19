package com.product.database.entity;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "user_info")
public class UserInfo {

    @Id
    @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
    @Column(name = "email", nullable = false, unique = true)
    private String email;
    @Column(name = "password")
    private String password;
    @Column(name = "display_name")
    private String displayName;
    @Column(name = "image")
    private String image;
    @Column(name = "status")
    private Integer status;
    @Column(name = "created_date", columnDefinition = "timestamp default now()")
    @CreationTimestamp
    private LocalDateTime createdDate;
    @Column(name = "last_updated_date", columnDefinition = "timestamp default now() on update now()")
    @UpdateTimestamp
    private LocalDateTime lastUpdatedDate;
}
