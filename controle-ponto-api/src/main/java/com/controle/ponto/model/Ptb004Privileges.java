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
@Table(name = "ptb004_privileges", schema = "ponto")
@SequenceGenerator(name = "sq_id_privileges", sequenceName = "seq_id_privileges", allocationSize = 1, initialValue = 1)
public class Ptb004Privileges {
	
	@Id
	@GeneratedValue(generator = "sq_id_privileges", strategy = GenerationType.SEQUENCE)
	@Column(name = "id_privileges")
	private Long id;
	
	@Column(name = "description_privileges")
	private String description;

}
