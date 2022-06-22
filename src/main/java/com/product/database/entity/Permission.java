package com.product.database.entity;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "permission")
public class Permission {
    @Id
    @Column(name = "permission_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long permissionId;
    @Column(name = "code",unique = true)
    private String code;
    @Column(name = "description")
    private String description;
    @Column(name = "created_date", columnDefinition = "timestamp default now()")
    @CreationTimestamp
    private LocalDateTime createdDate;
    @Column(name = "last_updated_date", columnDefinition = "timestamp default now() on update now()")
    @UpdateTimestamp
    private LocalDateTime lastUpdatedDate;
}
