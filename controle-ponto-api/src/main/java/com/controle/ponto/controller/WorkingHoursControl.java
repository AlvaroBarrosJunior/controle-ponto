package com.controle.ponto.controller;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.controle.ponto.config.ServicesApi;
import com.controle.ponto.dto.WorkingHoursDTO;
import com.controle.ponto.model.Ptb001WorkingHours;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Api(value = "WorkingHoursControl", consumes = "application/json", produces = "application/json")
@RestController
@RequestMapping(value = "/working-hours", consumes = "application/json;charset=UTF-8", produces = "application/json;charset=UTF-8")
public class WorkingHoursControl extends ServicesApi{

	@ApiResponses({
		@ApiResponse(code = 200, message = "Sucessfully", response = Ptb001WorkingHours.class),
		@ApiResponse(code = 400, message = "BadRequest"),
		@ApiResponse(code = 500, message = "Internal Server Error")
	})
	@PostMapping(value = "/create")
	public ResponseEntity<?> createWorkingHour(@RequestBody @Valid WorkingHoursDTO workingHours){
		Ptb001WorkingHours workingHourModel = this.workingHoursService.saveWorkingHour(workingHours);
		return new ResponseEntity<> (workingHourModel, HttpStatus.OK);
	}
	
	
}
