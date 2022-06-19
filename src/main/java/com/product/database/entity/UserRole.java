package com.product.database.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "user_role")
public class UserRole implements Serializable {
    @Column(name = "user_id")
    @Id
    private Long userId;
    @Column(name = "role_id")
    @Id
    private Long roleId;
}
