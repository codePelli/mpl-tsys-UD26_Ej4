package ejercicios.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import ejercicios.controller.EquipoController;
import ejercicios.controller.InvestigadorController;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Facultad {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigo;
	
	private String nombre;
	
	@OneToMany(mappedBy = "facultad")
	@JsonIgnore
	private List<Equipo> equipos;
	
	@OneToMany(mappedBy = "facultad")
	@JsonIgnore
	private List<Investigador> investigadores;
	
	public Facultad() {
		super();
	}

	public Facultad(int codigo, String nombre, List<Equipo> equipos, List<Investigador> investigadores) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.equipos = equipos;
		this.investigadores = investigadores;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Equipo> getEquipos() {
		return equipos;
	}

	public void setEquipos(List<Equipo> equipos) {
		this.equipos = equipos;
	}

	public List<Investigador> getInvestigadores() {
		return investigadores;
	}

	public void setInvestigadores(List<Investigador> investigadores) {
		this.investigadores = investigadores;
	}
}
