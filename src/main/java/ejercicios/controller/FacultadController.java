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

import ejercicios.dto.Facultad;
import ejercicios.service.FacultadService;

@RestController
@RequestMapping("/facultad")
public class FacultadController {

	@Autowired
	private FacultadService facultadService;
	
	@GetMapping("/list")
	public List<Facultad> listFacultades() {
		
		return facultadService.getFacultad();
	}
	
	@GetMapping("/{codigo}")
	public Facultad facuPorCod(@PathVariable int codigo) {
		
		return facultadService.facultadPorId(codigo);
	}
	
	@PostMapping("/add")
	public Facultad insertFacu(@RequestBody Facultad facultad) {
		
		return facultadService.saveFacultad(facultad);
	}
	
    @PutMapping("/{codigo}")
    public Facultad updateFacu(@PathVariable(name = "codigo") int codigo, 
    		@RequestBody Facultad facultad) {
				
    	return facultadService.updateFacultad(facultad);
    }
    
    @DeleteMapping("/{codigo}")
    public void deleteFacu(@PathVariable int codigo) {
    	
    	facultadService.deleteFacultad(codigo);
    }
}
