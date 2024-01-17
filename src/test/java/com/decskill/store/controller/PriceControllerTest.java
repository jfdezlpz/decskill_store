package com.decskill.store.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.decskill.store.web.model.Price;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

@SpringBootTest
@AutoConfigureMockMvc
public class PriceControllerTest {

private MockMvc mockMvc;
	
	@Autowired
	public void setMockMvc(MockMvc mockMvc) {
		this.mockMvc = mockMvc;
	}
	
	public static final String PRICE_SERVICE_URL = "http://localhost:8080/price/";
	
	@Test
	public void test1() throws Exception {
		
		ObjectMapper map = new ObjectMapper();
		map.registerModule(new JavaTimeModule());
		
		MvcResult result = this.mockMvc.perform(MockMvcRequestBuilders.get(PRICE_SERVICE_URL+"1/35455/2020-06-14-10.00.00")).andExpect(MockMvcResultMatchers.status().isOk()).andReturn();
		
		Price resultPrice = map.readValue(result.getResponse().getContentAsString(), Price.class);
		assertEquals(1, resultPrice.getPriceList());
		assertEquals(new BigDecimal("35.50"), resultPrice.getPrice());
	}
	
	@Test
	public void test2() throws Exception {
		
		ObjectMapper map = new ObjectMapper();
		map.registerModule(new JavaTimeModule());
		
		MvcResult result = this.mockMvc.perform(MockMvcRequestBuilders.get(PRICE_SERVICE_URL+"1/35455/2020-06-14-16.00.00")).andExpect(MockMvcResultMatchers.status().isOk()).andReturn();
		
		Price resultPrice = map.readValue(result.getResponse().getContentAsString(), Price.class);
		assertEquals(2, resultPrice.getPriceList());
		assertEquals(new BigDecimal("25.45"), resultPrice.getPrice());
	}
	
	@Test
	public void test3() throws Exception {
		
		ObjectMapper map = new ObjectMapper();
		map.registerModule(new JavaTimeModule());
		
		MvcResult result = this.mockMvc.perform(MockMvcRequestBuilders.get(PRICE_SERVICE_URL+"1/35455/2020-06-14-21.00.00")).andExpect(MockMvcResultMatchers.status().isOk()).andReturn();
		
		Price resultPrice = map.readValue(result.getResponse().getContentAsString(), Price.class);
		assertEquals(1, resultPrice.getPriceList());
		assertEquals(new BigDecimal("35.50"), resultPrice.getPrice());
	}
	
	@Test
	public void test4() throws Exception {
		
		ObjectMapper map = new ObjectMapper();
		map.registerModule(new JavaTimeModule());
		
		MvcResult result = this.mockMvc.perform(MockMvcRequestBuilders.get(PRICE_SERVICE_URL+"1/35455/2020-06-15-10.00.00")).andExpect(MockMvcResultMatchers.status().isOk()).andReturn();
		
		Price resultPrice = map.readValue(result.getResponse().getContentAsString(), Price.class);
		assertEquals(3, resultPrice.getPriceList());
		assertEquals(new BigDecimal("30.50"), resultPrice.getPrice());
	}
	
	@Test
	public void test5() throws Exception {
		
		ObjectMapper map = new ObjectMapper();
		map.registerModule(new JavaTimeModule());
		
		MvcResult result = this.mockMvc.perform(MockMvcRequestBuilders.get(PRICE_SERVICE_URL+"1/35455/2020-06-16-21.00.00")).andExpect(MockMvcResultMatchers.status().isOk()).andReturn();
		
		Price resultPrice = map.readValue(result.getResponse().getContentAsString(), Price.class);
		assertEquals(4, resultPrice.getPriceList());
		assertEquals(new BigDecimal("38.95"), resultPrice.getPrice());
	}
}
