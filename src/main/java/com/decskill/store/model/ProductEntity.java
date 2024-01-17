package com.decskill.store.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table(name = "PRODUCT")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductEntity {

	@Id
	@Column(name = "PRODUCT_ID")
	private Integer productId;
	
	@Column(name = "PRODUCT_NAME")
	private String productName;
	
}
