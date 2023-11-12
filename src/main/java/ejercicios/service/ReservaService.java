package ejercicios.service;

import java.util.List;

import ejercicios.controller.EquipoController;
import ejercicios.dto.Reserva;

public interface ReservaService {
	
	List<Reserva> getReserva();
	
	Reserva reservaPorId(int id);
	
	Reserva saveReserva(Reserva reserva);
	
	Reserva updateReserva(Reserva reserva);
	
	void deleteReserva(int id);

}
