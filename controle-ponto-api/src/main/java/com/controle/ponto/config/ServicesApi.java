package com.controle.ponto.config;

import org.springframework.beans.factory.annotation.Autowired;

import com.controle.ponto.service.WorkingHoursService;

public class ServicesApi {
	
	@Autowired
	protected WorkingHoursService workingHoursService;

}
