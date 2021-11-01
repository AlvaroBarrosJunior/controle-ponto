package com.controle.ponto.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.controle.ponto.dto.WorkingHoursDTO;
import com.controle.ponto.model.Ptb001WorkingHours;
import com.controle.ponto.repository.WorkingHoursRepository;

@Service
public class WorkingHoursService {
	
	@Autowired
	private WorkingHoursRepository workingHoursRepository;
	
	public Ptb001WorkingHours saveWorkingHour(WorkingHoursDTO workingHoursDTO) {
		
		Ptb001WorkingHours workingHour = new Ptb001WorkingHours();
		BeanUtils.copyProperties(workingHoursDTO, workingHour);
		
		workingHour = this.workingHoursRepository.save(workingHour);
		
		return workingHour;
	}

}
