package com.controle.ponto.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Data
@Entity
@Table(name = "ptb006_user", schema = "ponto")
@SequenceGenerator(name = "sq_id_user", sequenceName = "seq_id_user", allocationSize = 1, initialValue = 1)
public class Ptb006User {
	
	@Id
	@GeneratedValue(generator = "sq_id_user", strategy = GenerationType.SEQUENCE)
	@Column(name = "id_user")
	private Long id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "tolerance")
	private BigDecimal tolerance;
	
	@Column(name = "beginning_time")
	private LocalDateTime begnningTime;
	
	@Column(name = "ending_time")
	private LocalDateTime endingTime;
	
	@ManyToOne
	@JoinColumn(name = "id_working_hours", insertable = false, updatable = false)
	private Ptb001WorkingHours workingHours;
	
	@ManyToOne
	@JoinColumn(name = "id_user_category", insertable = false, updatable = false)
	private Ptb002UserCategory userCategory;
	
	@ManyToOne
	@JoinColumn(name = "id_company", insertable = false, updatable = false)
	private Ptb003Company company;
	
	@ManyToOne
	@JoinColumn(name = "id_privileges", insertable = false, updatable = false)
	private Ptb004Privileges privileges;
	
}
