package com.decskill.store.service;

import java.time.LocalDateTime;
import java.util.Optional;

import org.springframework.stereotype.Component;

import com.decskill.store.port.in.PricePort;
import com.decskill.store.port.out.PriceDatabasePort;
import com.decskill.store.web.model.Price;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class PriceService implements PricePort {
	
	private PriceDatabasePort priceDatabasePort;

	@Override
	public Optional<Price> getPriceByProductBrandAndDate(Integer productId, Integer brandId, LocalDateTime date) {
		return priceDatabasePort.findPricesByBrandAndProductAndDate(brandId, productId, date).stream().findFirst();

	}

}
