package ejercicios.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ejercicios.controller.EquipoController;
import ejercicios.dao.EquipoDAO;
import ejercicios.dto.Equipo;
@Service
public class EquipoServiceImpl implements EquipoService{

	@Autowired
	EquipoDAO equipoDAO;
	
	@Override
	public List<Equipo> getEquipos() {
		// TODO Auto-generated method stub
		return equipoDAO.findAll();
	}

	@Override
	public Equipo equipoPorId(String numserie) {
		// TODO Auto-generated method stub
		return equipoDAO.findById(numserie).get();
	}

	@Override
	public Equipo saveEquipo(Equipo numserie) {
		// TODO Auto-generated method stub
		return equipoDAO.save(numserie);
	}

	@Override
	public Equipo updateEquipo(Equipo numserie) {
		// TODO Auto-generated method stub
		return equipoDAO.save(numserie);
	}

	@Override
	public void deleteEquipo(String numserie) {
		// TODO Auto-generated method stub
		equipoDAO.deleteById(numserie);
	}

}
