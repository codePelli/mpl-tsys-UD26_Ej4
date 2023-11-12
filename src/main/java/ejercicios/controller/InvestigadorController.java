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

import ejercicios.dto.Investigador;
import ejercicios.service.InvestigadorService;

@RestController
@RequestMapping("/investigador")
public class InvestigadorController {
	
	@Autowired
	private InvestigadorService invesService;
	
	@GetMapping("/list")
	public List<Investigador> listInves() {
		
		return invesService.getInvestigador();
	}
	
	@GetMapping("/{dni}")
	public Investigador invePorCod(@PathVariable String dni) {
		
		return invesService.investigadorPorId(dni);
	}
	
	@PostMapping("/add")
	public Investigador insertInves(@RequestBody Investigador inves) {
		
		return invesService.saveInvestigador(inves);
	}
	
    @PutMapping("/{dni}")
    public Investigador updateInves(@PathVariable(name = "dni") String dni, 
    		@RequestBody Investigador inves) {
				
    	return invesService.updateInvestigador(inves);
    }
    
    @DeleteMapping("/{dni}")
    public void deleteInves(@PathVariable String dni) {
    	
    	invesService.deleteInvestigador(dni);
    }
}
