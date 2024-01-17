package com.decskill.store.model.repository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.decskill.store.model.PriceEntity;

public interface PriceEntityRepository extends JpaRepository<PriceEntity, Integer> {

	@Query("SELECT p FROM PriceEntity p WHERE p.brand.brandId = :brandId AND p.product.productId = :productId AND p.startDate < :date AND p.endDate >= :date order by p.priority desc")
	List<PriceEntity> findPricesByBrandAndProductAndDate(@Param(value = "brandId") Integer brandId,@Param(value="productId") Integer productId,@Param(value="date") LocalDateTime date);
	
}
