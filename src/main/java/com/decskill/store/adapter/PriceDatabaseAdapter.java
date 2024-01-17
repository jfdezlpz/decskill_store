package com.decskill.store.adapter;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Component;

import com.decskill.store.model.mapper.PriceMapper;
import com.decskill.store.model.repository.PriceEntityRepository;
import com.decskill.store.port.out.PriceDatabasePort;
import com.decskill.store.web.model.Price;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class PriceDatabaseAdapter implements PriceDatabasePort {

	private PriceEntityRepository priceRepository;
	private PriceMapper priceMapper;
	
	@Override
	public List<Price> findPricesByBrandAndProductAndDate(Integer brandId, Integer productId,
			LocalDateTime date) {
		return priceMapper.toPriceList(priceRepository.findPricesByBrandAndProductAndDate(brandId, productId, date));
	}

}
