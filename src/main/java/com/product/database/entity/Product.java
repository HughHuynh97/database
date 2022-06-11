package com.product.database.entity;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name = "product")
public class Product implements Serializable {
    @Id
    @Column(name = "prod_id")
    private Long prodId;
    @Id
    @Column(name = "provider")
    private String provider;
    @Column(name = "shop_id")
    private Long shopId;
    @Column(name = "name")
    private String name;
    @Column(name = "currency")
    private String currency;
    @Column(name = "image", columnDefinition = "text")
    private String image;
    @Column(name = "images", columnDefinition = "text")
    private String images;
    @Column(name = "price")
    private Long price;
    @Column(name = "min_price")
    private Long minPrice;
    @Column(name = "max_price")
    private Long maxPrice;
    @Column(name = "price_before_discount")
    private Long priceBeforeDiscount;
    @Column(name = "price_max_before_discount")
    private Long priceMaxBeforeDiscount;
    @Column(name = "price_min_before_discount")
    private Long priceMinBeforeDiscount;
    @Column(name = "shop_location", columnDefinition = "VARCHAR(100) DEFAULT ''")
    private String shopLocation;
    @Column(name = "description", columnDefinition = "text not null")
    private String description;
    @Column(name = "stock")
    private Long stock;
    @Column(name = "discount")
    private String discount;
    @Column(name = "rating", columnDefinition = "text")
    private String rating;
    @Column(name = "like_count")
    private Long likeCount;
    @Column(name = "attributes", columnDefinition = "text")
    private String attributes;
    @Column(name = "skus", columnDefinition = "text")
    private String sku;
    @Column(name = "provider_created_time", columnDefinition = "DATETIME NOT NULL")
    private Date providerCreatedTime;
    @Column(name = "status")
    private Integer status;
    @Column(name = "created_date", columnDefinition = "timestamp default now()")
    @CreationTimestamp
    private LocalDateTime createdDate;
    @Column(name = "last_updated_date", columnDefinition = "timestamp default now() on update now()")
    @UpdateTimestamp
    private LocalDateTime lastUpdatedDate;
}
