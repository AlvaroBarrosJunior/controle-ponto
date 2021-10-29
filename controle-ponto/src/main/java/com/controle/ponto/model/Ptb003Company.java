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
@Table(name = "ptb003_company", schema = "ponto")
@SequenceGenerator(name = "sq_id_company", sequenceName = "seq_id_company", allocationSize = 1, initialValue = 1)
public class Ptb003Company {
	
	@Id
	@GeneratedValue(generator = "sq_id_company", strategy = GenerationType.SEQUENCE)
	@Column(name = "id_company")
	private Long id;
	
	@Column(name = "description_company")
	private String description;
	
	@Column(name = "cnpj")
	private String cnpj;
	
	@Column(name = "address")
	private String address;
	
	@Column(name = "city")
	private String city;
	
	@Column(name = "state_province")
	private String stateProvince;
	
	@Column(name = "phone_number")
	private String phoneNumber;
}
