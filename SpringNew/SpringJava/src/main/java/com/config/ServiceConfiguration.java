package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.service.ReservationService;
import com.service.ReservationServiceImpl;

@Configuration
public class ServiceConfiguration {
	@Bean
	public ReservationService reservationService() {
		return new ReservationServiceImpl();
	}
}