package com.decskill.store.web.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.decskill.store.model.CurrencyEnum;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
public class Price {

	private Integer brandId;
	
	private LocalDateTime startDate;
	
	private LocalDateTime endDate;
	
	private Integer priceList;
	
	private Integer productId;
	
	private Integer priority;
	
	private BigDecimal price;
	
	private CurrencyEnum currency;
	
}
