package ejercicios.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ejercicios.dto.Investigador;

public interface InvestigadorDAO extends JpaRepository<Investigador, String>{

}
