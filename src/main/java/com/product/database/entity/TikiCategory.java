package com.product.database.entity;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "tiki_category")
public class TikiCategory {
    @Id
    @Column(name = "cat_id")
    private Long catId;
    @Column(name = "name")
    private String name;
    @Column(name = "url")
    private String url;
    @Column(name = "image")
    private String image;
    @Column(name = "status")
    private String status;
    @Column(name = "product_count")
    private Long productCount;
    @Column(name = "level")
    private Integer level;
    @Column(name = "description", columnDefinition = "TEXT")
    private String description;
    @Column(name = "parent_id")
    private Long parentId;
    @Column(name = "created_date", columnDefinition = "timestamp default now()")
    @CreationTimestamp
    private LocalDateTime createdDate;
    @Column(name = "last_updated_date", columnDefinition = "timestamp default now() on update now()")
    @UpdateTimestamp
    private LocalDateTime lastUpdatedDate;
}
