package com.product.database.entity;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "shopee_shop")
public class ShopeeShop implements Serializable {
    @Id
    @Column(name = "shop_id")
    private Long shopId;
    @Column(name = "user_id")
    private Long userId;
    @Column(name = "name")
    private String name;
    @Column(name = "username")
    private String username;
    @Column(name = "avatar")
    private String avatar;
    @Column(name = "background")
    private String background;
    @Column(name = "shop_location")
    private String shopLocation;
    @Column(name = "rating_star")
    private String ratingStar;
    @Column(name = "rating_good")
    private String ratingGood;
    @Column(name = "rating_normal")
    private String ratingNormal;
    @Column(name = "rating_bad")
    private String ratingBad;
    @Column(name = "total_product")
    private Long totalProduct;
    @Column(name = "follower")
    private Long follower;
    @Column(name = "description", columnDefinition = "TEXT NOT NULL")
    private String description;
    @Column(name = "country")
    private String country;
    @Column(name = "status")
    private Integer status;
    @Column(name = "created_date", columnDefinition = "timestamp default now()")
    @CreationTimestamp
    private LocalDateTime createdDate;
    @Column(name = "last_updated_date", columnDefinition = "timestamp default now() on update now()")
    @UpdateTimestamp
    private LocalDateTime lastUpdatedDate;
}
