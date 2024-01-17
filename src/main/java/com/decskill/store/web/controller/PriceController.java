package com.decskill.store.web.controller;

import java.time.LocalDateTime;
import java.util.Optional;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.decskill.store.port.in.PricePort;
import com.decskill.store.web.model.Price;

import jakarta.annotation.Nonnull;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/price")
@AllArgsConstructor
public class PriceController {
	
	private PricePort pricePort;
	
	@GetMapping("/{brandId}/{productId}/{date}")
	public ResponseEntity<Price> getPrice(
			@PathVariable("brandId") @Nonnull
			Integer brandId, 
			@PathVariable("productId") @Nonnull
			Integer productId, 
			@PathVariable("date") @Nonnull @DateTimeFormat(pattern = "yyyy-MM-dd-HH.mm.ss")
			LocalDateTime date) {
		Optional<Price> resultPrice = pricePort.getPriceByProductBrandAndDate(productId, brandId, date);
		return resultPrice.isPresent()?
				new ResponseEntity<Price>(resultPrice.get(), HttpStatus.OK):
					new ResponseEntity<Price>(HttpStatus.NOT_FOUND);
	}

}
