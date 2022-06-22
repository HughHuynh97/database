package com.product.database.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "role_permission")
public class RolePermission implements Serializable {
    @Id
    private Long roleId;
    @Id
    private Long permissionId;
}
