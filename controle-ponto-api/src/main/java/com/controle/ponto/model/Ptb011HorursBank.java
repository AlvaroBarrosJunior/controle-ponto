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
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Data
@Entity
@Table(name = "ptb011_hours_bank", schema = "ponto")
public class Ptb011HorursBank {

	@Data
	@SequenceGenerator(name = "sq_id_hours_bank", sequenceName = "seq_id_hours_bank", allocationSize = 1, initialValue = 1)
	@Embeddable
	public class HoursBankId implements Serializable{
		private static final long serialVersionUID = 1L;
		
		@Column(name = "id_hours_bank")
		@GeneratedValue(generator = "sq_id_hours_bank", strategy = GenerationType.SEQUENCE)
		private Long idHoursBank;
		
		@Column(name = "id_movement")
		private Long idMovement;
		
		@Column(name = "id_user")
		private Long idUser;
	}
	
	@EmbeddedId
	private HoursBankId id;
	
	@Column(name = "working_hours")
	private LocalDateTime workingHours;
	
	@Column(name = "qtd_hours")
	private BigDecimal qtdHours;
	
	@Column(name = "hours_balance")
	private BigDecimal hoursBalance;
}
