package com.controle.ponto.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "ptb007_occurrence", schema = "ponto")
@SequenceGenerator(name = "sq_id_occurrence", sequenceName = "sq_id_occurrence", allocationSize = 1, initialValue = 1)
public class Ptb007Occurrence {
	
	@Id
	@GeneratedValue(generator = "sq_id_occurrence", strategy = GenerationType.SEQUENCE)
	@Column(name = "id_occurrence")
	private Long id;
	
	@Column(name = "description_occurrence")
	private String description;

	@Column(name = "name")
	private String name;
	
}
