package ejercicios.service;

import java.util.List;

import ejercicios.dto.Facultad;

public interface FacultadService {
	
	List<Facultad> getFacultad();
	
	Facultad facultadPorId(int codigo);
	
	Facultad saveFacultad(Facultad facultad);
	
	Facultad updateFacultad(Facultad facultad);
	
	void deleteFacultad(int codigo);
}
