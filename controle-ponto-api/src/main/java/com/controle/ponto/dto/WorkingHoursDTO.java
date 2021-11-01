package com.controle.ponto.dto;

import javax.validation.constraints.NotBlank;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(description = "WorkingHoursDTO to Working Hours creation")
@Data
public class WorkingHoursDTO {

	@ApiModelProperty(value = "Working Hours description", required = true, dataType = "String")
	@NotBlank(message = "Description can't be blank")
	private String desctiption;
}
