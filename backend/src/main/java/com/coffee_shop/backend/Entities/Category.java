package com.coffee_shop.backend.Entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Entity
@Table(name = "category")
@Setter
@Getter
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "category_id")
    private Long categoryId;

    @Column(name = "category_type")
    private String categoryType;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "category")
    private Set<Product> product;
}
