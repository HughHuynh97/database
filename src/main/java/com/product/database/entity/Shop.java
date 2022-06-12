package com.product.database.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "shop")
public class Shop implements Serializable {
    @Id
    @Column(name = "shop_id")
    private Long shopId;
    @Id
    @Column(name = "provider")
    private String provider;
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
}
