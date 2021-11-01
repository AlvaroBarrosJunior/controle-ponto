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
@Table(name = "ptb002_user_category", schema="ponto")
@SequenceGenerator(name="sq_id_user_category", sequenceName="seq_id_user_category", allocationSize = 1, initialValue = 1)
public class Ptb002UserCategory {

	@Id
	@GeneratedValue(generator = "sq_id_user_category", strategy = GenerationType.SEQUENCE)
	@Column(name = "id_user_category")
	private Long id;
	
	@Column(name = "description_user_category")
	private String description;
}
