package ejercicios.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ejercicios.controller.EquipoController;
import ejercicios.dto.Equipo;

public interface EquipoDAO extends JpaRepository<Equipo, String>{

}
