package com.luv2code.ecommerce.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;
import com.luv2code.ecommerce.entity.Product;

@Entity
@Table(name="product_category")
//@Data -> if you use lomok with @OneToMany and @ManyToOne it will cause bugs
@Getter
@Setter
public class ProductCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;
    @Column(name="category_name")
    private String categoryName;
    @OneToMany(cascade=CascadeType.ALL, mappedBy="category")
    private Set<Product> products;






}
