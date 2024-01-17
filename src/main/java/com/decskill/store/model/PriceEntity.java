package com.decskill.store.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "PRICE")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PriceEntity {

	@Id
	@Column(name = "PRICE_ID")
	private Integer priceId;
	
	@ManyToOne
	@JoinColumn(name = "BRAND_ID", updatable = false, insertable = false)
	private BrandEntity brand;
	
	@Column(name = "BRAND_ID")
	private Integer brandId;
	
	@Column(name = "START_DATE")
	private LocalDateTime startDate;
	
	@Column(name = "END_DATE")
	private LocalDateTime endDate;
	
	@Column(name = "PRICE_LIST")
	private Integer priceList;
	
	@ManyToOne
	@JoinColumn(name = "PRODUCT_ID", updatable = false, insertable = false)
	private ProductEntity product;
	
	@Column(name = "PRODUCT_ID")
	private Integer productId;
	
	@Column(name = "PRIORITY")
	private Integer priority;
	
	@Column(name = "PRICE")
	private BigDecimal price;
	
	@Column(name = "CURR")
	@Enumerated(EnumType.STRING)
	private CurrencyEnum currency;
}
