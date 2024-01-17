package com.decskill.store.port.out;

import java.time.LocalDateTime;
import java.util.List;

import com.decskill.store.web.model.Price;


public interface PriceDatabasePort {

	List<Price> findPricesByBrandAndProductAndDate(Integer brandId, Integer productId, LocalDateTime date);

}
