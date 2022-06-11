package com.product.database.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "category_product")
public class CategoryProduct implements Serializable {
    @Id
    @Column(name = "cat_id")
    private Long catId;
    @Id
    @Column(name = "prod_id")
    private Long prodId;
}
