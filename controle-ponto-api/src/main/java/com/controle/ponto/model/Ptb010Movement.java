package com.controle.ponto.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Data
@Entity
@Table(name = "ptb010_movement", schema = "ponto")
public class Ptb010Movement {
	
	@Data
	@SequenceGenerator(name = "sq_id_movement", sequenceName = "seq_id_movement", allocationSize = 1, initialValue = 1)
	@Embeddable
	public class MovementId implements Serializable{
		private static final long serialVersionUID = 1L;
		
		@Column(name = "id_movement")
		@GeneratedValue(generator = "sq_id_movement", strategy = GenerationType.SEQUENCE)
		private Long idMovement;
		
		@Column(name = "id_user")
		private Long idUser;
	}
	
	@EmbeddedId
	private MovementId id;
	
	@Column(name = "start_date")
	private LocalDateTime startDate;
	
	@Column(name = "end_date")
	private LocalDateTime endDate;
	
	@Column(name = "period")
	private BigDecimal period;
	
	@OneToOne
	@JoinColumn(name = "id_occurrence", insertable = false, updatable = false)
	private Ptb007Occurrence occurrence;
	
	@OneToOne
	@JoinColumn(name = "id_calendar", insertable = false, updatable = false)
	private Ptb009Calendar calendar;

}
