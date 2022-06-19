package com.product.database.entity;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "shopee_category")
public class ShopeeCategory implements Serializable {

    @Id
    @Column(name = "cat_id")
    private Long catId;

    @Column(name = "code", columnDefinition = "varchar(100)")
    private String code;

    @Column(name = "name", columnDefinition = "varchar(100)")
    private String name;

    @Column(name = "image", columnDefinition = "varchar(100)")
    private String image;

    @Column(name = "parent_cat_id")
    private Long parentCatId;

    @Column(name = "total_count")
    private Long totalCount;

    @Column(name = "created_date", columnDefinition = "timestamp default now()")
    @CreationTimestamp
    private LocalDateTime createdDate;

    @Column(name = "last_updated_date", columnDefinition = "timestamp default now() on update now()")
    @UpdateTimestamp
    private LocalDateTime lastUpdatedDate;
}
