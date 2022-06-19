package com.product.database.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

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
}
