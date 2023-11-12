package ejercicios.service;

import java.util.List;

import ejercicios.controller.EquipoController;
import ejercicios.dto.Equipo;

public interface EquipoService {
	
	List<Equipo> getEquipos();
	
	Equipo equipoPorId(String numserie);
	
	Equipo saveEquipo(Equipo numserie);
	
	Equipo updateEquipo(Equipo numserie);
	
	void deleteEquipo(String numserie);
}
