package ejercicios.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ejercicios.dto.Reserva;
import ejercicios.service.ReservaService;

@RestController
@RequestMapping("/reserva")
public class ReservaController {

	@Autowired
	private ReservaService reservaService;
	
	@GetMapping("/list")
	public List<Reserva> listReserva() {
		
		return reservaService.getReserva();
	}
	
	@GetMapping("/{id}")
	public Reserva resPorCod(@PathVariable int id) {
		
		return reservaService.reservaPorId(id);
	}
	
	@PostMapping("/add")
	public Reserva insertRes(@RequestBody Reserva reserva) {
		
		return reservaService.saveReserva(reserva);
	}
	
    @PutMapping("/{id}")
    public Reserva updateRes(@PathVariable(name = "id") int id, 
    		@RequestBody Reserva reserva) {
				
    	return reservaService.saveReserva(reserva);
    }
    
    @DeleteMapping("/{id}")
    public void deleteRes(@PathVariable int id) {
    	
    	reservaService.deleteReserva(id);
    }
}
