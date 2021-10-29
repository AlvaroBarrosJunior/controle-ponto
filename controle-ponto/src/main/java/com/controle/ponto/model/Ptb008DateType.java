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
@Table(name = "ptb008_date-type", schema = "ponto")
@SequenceGenerator(name = "sq_id_date_type", sequenceName = "seq_id_date_type", allocationSize = 1, initialValue = 1)
public class Ptb008DateType {

	@Id
	@GeneratedValue(generator = "sq_id_date_type", strategy = GenerationType.SEQUENCE)
	@Column(name = "id_date_type")
	private Long id;
	
	@Column(name = "description_date_type")
	private String description;
}
