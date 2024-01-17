package com.decskill.store.port.in;

import java.time.LocalDateTime;
import java.util.Optional;

import com.decskill.store.web.model.Price;

public interface PricePort {

	Optional<Price> getPriceByProductBrandAndDate(Integer productId, Integer brandId, LocalDateTime date);

}
