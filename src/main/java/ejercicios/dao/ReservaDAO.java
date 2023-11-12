package ejercicios.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ejercicios.dto.Reserva;


public interface ReservaDAO extends JpaRepository<Reserva, Integer>{

}
