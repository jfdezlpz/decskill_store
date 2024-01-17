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
@Table(name = "BRAND")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BrandEntity {

	@Id
	@Column(name = "BRAND_ID")
	private Integer brandId;
	
	@Column(name = "BRAND_NAME")
	private String brandName;
}
