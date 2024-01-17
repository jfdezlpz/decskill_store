package com.decskill.store.model.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.decskill.store.model.PriceEntity;
import com.decskill.store.web.model.Price;

@Mapper(componentModel = "spring")
public interface PriceMapper {
	
	public List<Price> toPriceList (List<PriceEntity> entityList);
	
	public Price toPrice(PriceEntity entity);

}
