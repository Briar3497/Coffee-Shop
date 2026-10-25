package com.coffee_shop.backend.Entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Entity
@Table(name = "flavor")
@Setter
@Getter
public class Flavor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "flavor_id")
    private Long flavorId;

    @Column(name = "flavor_name")
    private String flavorName;

    @ManyToMany(mappedBy = "flavor")
    private Set<Product> product;
}
