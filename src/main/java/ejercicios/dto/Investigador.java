package ejercicios.dto;

import ejercicios.controller.FacultadController;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Investigador {
	
	@Id
	@Column(name = "dni")
	private String dni;
	private String nomapels;
	
	@ManyToOne
	@JoinColumn(name = "facultad")
	private Facultad facultad;

	public Investigador() {
		super();
	}

	public Investigador(String dni, String nomapels, Facultad facultad) {
		super();
		this.dni = dni;
		this.nomapels = nomapels;
		this.facultad = facultad;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNomapels() {
		return nomapels;
	}

	public void setNomapels(String nomapels) {
		this.nomapels = nomapels;
	}

	public Facultad getFacultad() {
		return facultad;
	}

	public void setFacultad(Facultad facultad) {
		this.facultad = facultad;
	}
}
