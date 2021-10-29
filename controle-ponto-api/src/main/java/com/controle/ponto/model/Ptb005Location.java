package com.controle.ponto.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "ptb005_location", schema = "ponto")
@SequenceGenerator(name = "sq_id_location", sequenceName = "seq_id_location", allocationSize = 1, initialValue = 1)
public class Ptb005Location {
	
	@Id
	@GeneratedValue(generator = "sq_id_location", strategy = GenerationType.SEQUENCE)
	@Column(name = "id_location")
	private Long id;
	
	@Column(name = "description_location")
	private String description;
	
	@ManyToOne
	@JoinColumn(name = "id_privileges", insertable = false, updatable = false)
	private Ptb004Privileges privileges;
}
