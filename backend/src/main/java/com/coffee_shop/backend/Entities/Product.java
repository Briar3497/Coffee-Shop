package com.coffee_shop.backend.Entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;

@Entity
@Table(name = "products")
@Getter
@Setter
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "product_name")
    private String productName;

    @Column(name = "product_img")
    private String productImage;

    @Column(name = "product_img_alt")
    private String productImageAlt;

    @Column(name = "product_descript")
    private String productDescription;

    @Column(name = "product_price")
    private Double productPrice;

    //TODO: add category

    //TODO: add flavor

    @CreationTimestamp
    @Column(name = "created_date")
    private Date createdDate;

    @UpdateTimestamp
    @Column(name = "updated_date")
    private Date updatedDate;
}
