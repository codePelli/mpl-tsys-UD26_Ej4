package ejercicios.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ejercicios.dao.ReservaDAO;
import ejercicios.dto.Reserva;

@Service
public class ReservaServiceImpl implements ReservaService{

	@Autowired
	private ReservaDAO reservaDAO;
	
	@Override
	public List<Reserva> getReserva() {
		// TODO Auto-generated method stub
		return reservaDAO.findAll();
	}

	@Override
	public Reserva reservaPorId(int id) {
		// TODO Auto-generated method stub
		return reservaDAO.findById(id).get();
	}

	@Override
	public Reserva saveReserva(Reserva reserva) {
		// TODO Auto-generated method stub
		return reservaDAO.save(reserva);
	}

	@Override
	public Reserva updateReserva(Reserva reserva) {
		// TODO Auto-generated method stub
		return reservaDAO.save(reserva);
	}

	@Override
	public void deleteReserva(int id) {
		// TODO Auto-generated method stub
		reservaDAO.deleteById(id);
	}

}
