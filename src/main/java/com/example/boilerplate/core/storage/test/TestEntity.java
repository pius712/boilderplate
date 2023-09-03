package com.example.boilerplate.core.storage.test;

import com.example.boilerplate.core.storage.base.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity()
@Table(name = "test")
public class TestEntity extends BaseEntity {

    @Column
    String name;


}
