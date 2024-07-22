package com.edubridge.app1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.edubridge.app1.model.ProductCategory;

@RepositoryRestResource(path = "product-category", collectionResourceRel = "productCategory")
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Long> {

}
