package com.product.database.entity;

import javax.persistence.*;

@Entity
@Table(name = "shop")
public class Shop {

    @Id
    @Column(name = "shop_id")
    private Long shopId;
    @Column(name = "name")
    private String name;
    @Column(name = "username")
    private String username;
    @Column(name = "avatar")
    private String avatar;
    @Column(name = "cover_image")
    private String coverImage;
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
    @Column(name = "item_count")
    private Long itemCount;
    @Column(name = "follower_count")
    private Long followerCount;
    @Column(name = "description", columnDefinition = "TEXT NOT NULL")
    private String description;
    @Column(name = "country")
    private String country;
    @Column(name = "status")
    private Integer status;
}
