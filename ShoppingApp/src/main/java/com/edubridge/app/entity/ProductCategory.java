package com.edubridge.app.entity;

import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class ProductCategory {
	@Id
	@GeneratedValue
	private Long id;
	
	private String categoryName;
	
	@OneToMany
	private Set<Product> products;

}
