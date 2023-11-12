package ejercicios.dto;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;

import ejercicios.controller.EquipoController;
import ejercicios.controller.InvestigadorController;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "reserva")
public class Reserva {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne
	@JoinColumn(name = "dni")
	@JsonIgnore
	private Investigador investigador;
	
	@Column(name = "comienzo")
	private Date comienzo;
	@Column(name = "fin")
	private Date fin;
	@Column(name = "numserie")
	private String numserie;
	
	@ManyToOne
	@JoinColumn(name = "num_serie")
	@JsonIgnore
	private Equipo equipo;
	
	public Reserva() {
		super();
	}

	public Reserva(int id, String numserie, Investigador investigador, Date comienzo, Date fin, Equipo equipo) {
		super();
		this.id = id;
		this.numserie = numserie;
		this.investigador = investigador;
		this.comienzo = comienzo;
		this.fin = fin;
		this.equipo = equipo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNumserie() {
		return numserie;
	}

	public void setNumserie(String numserie) {
		this.numserie = numserie;
	}

	public Investigador getInvestigador() {
		return investigador;
	}

	public void setInvestigador(Investigador investigador) {
		this.investigador = investigador;
	}

	public Date getComienzo() {
		return comienzo;
	}

	public void setComienzo(Date comienzo) {
		this.comienzo = comienzo;
	}

	public Date getFin() {
		return fin;
	}

	public void setFin(Date fin) {
		this.fin = fin;
	}

	public Equipo getEquipo() {
		return equipo;
	}

	public void setEquipo(Equipo equipo) {
		this.equipo = equipo;
	}

}
