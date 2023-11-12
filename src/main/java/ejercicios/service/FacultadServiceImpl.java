package ejercicios.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ejercicios.dao.FacultadDAO;
import ejercicios.dto.Facultad;
@Service
public class FacultadServiceImpl implements FacultadService{

	@Autowired
	FacultadDAO facultadDAO;
	
	@Override
	public List<Facultad> getFacultad() {
		// TODO Auto-generated method stub
		return facultadDAO.findAll();
	}

	@Override
	public Facultad facultadPorId(int codigo) {
		// TODO Auto-generated method stub
		return facultadDAO.findById(codigo).get();
	}

	@Override
	public Facultad saveFacultad(Facultad facultad) {
		// TODO Auto-generated method stub
		return facultadDAO.save(facultad);
	}

	@Override
	public Facultad updateFacultad(Facultad facultad) {
		// TODO Auto-generated method stub
		return facultadDAO.save(facultad);
	}

	@Override
	public void deleteFacultad(int codigo) {
		// TODO Auto-generated method stub
		facultadDAO.deleteById(codigo);
	}

}
