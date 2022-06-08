package com.product.database.entity;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name = "product")
public class Product {
    @Id
    @Column(name = "prod_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long prodId;
    @Column(name = "shop_id")
    private Long shopId;
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "currency", nullable = false)
    private String currency;
    @Column(name = "image", nullable = false)
    private String image;
    @Column(name = "images", nullable = false)
    private String images;
    @Column(name = "price", nullable = false)
    private Long price;
    @Column(name = "min_price", nullable = false)
    private Long minPrice;
    @Column(name = "max_price", nullable = false)
    private Long maxPrice;
    @Column(name = "price_before_discount", nullable = false)
    private Long priceBeforeDiscount;
    @Column(name = "price_max_before_discount", nullable = false)
    private Long priceMaxBeforeDiscount;
    @Column(name = "price_min_before_discount", nullable = false)
    private Long priceMinBeforeDiscount;
    @Column(name = "shop_location", columnDefinition = "VARCHAR(100) DEFAULT ''")
    private String shopLocation;
    @Column(name = "description", columnDefinition = "text not null")
    private String description;
    @Column(name = "stock")
    private Long stock;
    @Column(name = "discount")
    private String discount;
    @Column(name = "ctime")
    private Date ctime;
    @Column(name = "status")
    private String itemStatus;
    @Column(name = "created_date", columnDefinition = "timestamp default now()")
    @CreationTimestamp
    private LocalDateTime createdDate;
    @Column(name = "last_updated_date", columnDefinition = "timestamp default now() on update now()")
    @UpdateTimestamp
    private LocalDateTime lastUpdatedDate;
}
