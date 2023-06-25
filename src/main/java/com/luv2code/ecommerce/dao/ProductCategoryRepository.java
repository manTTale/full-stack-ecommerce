package com.luv2code.ecommerce.dao;

import com.luv2code.ecommerce.entity.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

//the annotation @RepositoryRestResource is used to customize the RESTful endpoint for the ProductCategoryRepository
//we have 2 attributes
//    collectionResourceRel -> specifies the name of the collection resource
//    path -> path of the REST API endpoint
@RepositoryRestResource(collectionResourceRel = "productCategory", path="product-category")
//we can accept calls from web browser scripts (our frontend) for this origin
@CrossOrigin("http://localhost:4200")
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Long> {
}
