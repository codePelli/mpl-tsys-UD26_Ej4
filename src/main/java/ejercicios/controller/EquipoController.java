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

import ejercicios.dto.Equipo;
import ejercicios.dto.Facultad;
import ejercicios.service.EquipoService;

@RestController
@RequestMapping("/equipo")
public class EquipoController {

	@Autowired
	private EquipoService equipoService;
	
	@GetMapping("/list")
	public List<Equipo> listEquipo() {
		
		return equipoService.getEquipos();
	}
	
	@GetMapping("/{numserie}")
	public Equipo equipoPorCod(@PathVariable String numserie) {
		
		return equipoService.equipoPorId(numserie);
	}
	
	@PostMapping("/add")
	public Equipo insertEquipo(@RequestBody Equipo equipo) {
		
		return equipoService.saveEquipo(equipo);
	}
	
    @PutMapping("/{numserie}")
    public Equipo updateEquipo(@PathVariable(name = "numserie") String numserie, 
    		@RequestBody Equipo equipo) {
				
    	return equipoService.updateEquipo(equipo);
    }
    
    @DeleteMapping("/{numserie}")
    public void deleteEquipo(@PathVariable String numserie) {
    	
    	equipoService.deleteEquipo(numserie);
    }
}
