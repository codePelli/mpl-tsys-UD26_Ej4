package ejercicios.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ejercicios.controller.FacultadController;
import ejercicios.dto.Facultad;

public interface FacultadDAO extends JpaRepository<Facultad, Integer>{

}
