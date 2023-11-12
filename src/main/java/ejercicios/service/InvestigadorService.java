package ejercicios.service;

import java.util.List;
import ejercicios.dto.Investigador;

public interface InvestigadorService {

	List<Investigador> getInvestigador();
	
	Investigador investigadorPorId(String dni);
	
	Investigador saveInvestigador(Investigador investigador);
	
	Investigador updateInvestigador(Investigador investigador);
	
	void deleteInvestigador(String dni);
}
