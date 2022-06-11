package com.product.database.entity;

import javax.persistence.*;

@Entity
@Table(name = "provider")
public class Provider {
    @Id
    @Column(name = "provider_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long providerId;
    @Column(name = "provider_name")
    private String name;
    @Column(name = "provider_code", unique = true, nullable = false)
    private String code;
}
