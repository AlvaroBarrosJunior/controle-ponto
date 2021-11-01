package com.controle.ponto.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Data
@Entity
@Table(name = "ptb009_calendar", schema = "ponto")
@SequenceGenerator(name = "sq_id_caledar", sequenceName = "seq_id_caledar", allocationSize = 1, initialValue = 1)
public class Ptb009Calendar {

	@Id
	@GeneratedValue(generator = "sq_id_caledar", strategy = GenerationType.SEQUENCE)
	@Column(name = "id_calendar")
	private Long id;
	
	@Column(name = "description_calendar")
	private String description;
	
	@Column(name = "special_date")
	private LocalDateTime specialDate;
	
	@OneToOne
	@JoinColumn(name = "id_date_type", insertable = false, updatable = false)
	private Ptb008DateType dateType;
}
