package com.product.database.entity;

import javax.persistence.*;

@Entity
@Table(name = "shop")
public class Shop {

    @Id
    @Column(name = "shop_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long shopId;
}
