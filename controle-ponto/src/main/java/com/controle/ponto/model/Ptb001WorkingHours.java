package com.controle.ponto.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.SequenceGenerator;

import lombok.Data;

@Data
@Entity
@Table(name="ptb001_working_hours", schema="ponto")
@SequenceGenerator(name = "sq_id_working_hours", sequenceName="seq_id_working_hours", allocationSize=1, initialValue=1)
public class Ptb001WorkingHours {
	
	@Id
	@GeneratedValue(generator = "sq_id_working_hours", strategy = GenerationType.SEQUENCE)
	@Column(name = "id_working_hours")
	private long id;
	
	@Column(name = "description_working_hours")
	private String desctiption;

}
