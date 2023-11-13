package ejercicios.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "equipo")
public class Equipo {

	@Id
	private String numserie;
	
	private String nombre;
	
	@ManyToOne
	@JoinColumn(name = "facultad")
    @JsonIgnore 
	private Facultad facultad;
	
	@OneToMany(mappedBy = "equipo")
	@JsonIgnore
	private List<Reserva> reserva;

	public Equipo() {
		super();
	}

	public Equipo(String numserie, String nombre, Facultad facultad) {
		super();
		this.numserie = numserie;
		this.nombre = nombre;
		this.facultad = facultad;
	}

	public String getNumSerie() {
		return numserie;
	}

	public void setNumSerie(String numserie) {
		this.numserie = numserie;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Facultad getFacultad() {
		return facultad;
	}

	public void setFacultad(Facultad facultad) {
		this.facultad = facultad;
	}
	
	public String getNumserie() {
		return numserie;
	}

	public void setNumserie(String numserie) {
		this.numserie = numserie;
	}

	public List<Reserva> getReserva() {
		return reserva;
	}

	public void setReserva(List<Reserva> reserva) {
		this.reserva = reserva;
	}
	
}
