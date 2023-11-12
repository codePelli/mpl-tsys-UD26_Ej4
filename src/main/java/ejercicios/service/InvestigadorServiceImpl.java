package ejercicios.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ejercicios.dao.InvestigadorDAO;
import ejercicios.dto.Investigador;
@Service
public class InvestigadorServiceImpl implements InvestigadorService{

	@Autowired
	InvestigadorDAO investigadorDAO;
	
	@Override
	public List<Investigador> getInvestigador() {
		// TODO Auto-generated method stub
		return investigadorDAO.findAll();
	}

	@Override
	public Investigador investigadorPorId(String dni) {
		// TODO Auto-generated method stub
		return investigadorDAO.findById(dni).get();
	}

	@Override
	public Investigador saveInvestigador(Investigador investigador) {
		// TODO Auto-generated method stub
		return investigadorDAO.save(investigador);
	}

	@Override
	public Investigador updateInvestigador(Investigador investigador) {
		// TODO Auto-generated method stub
		return investigadorDAO.save(investigador);
	}

	@Override
	public void deleteInvestigador(String dni) {
		// TODO Auto-generated method stub
		investigadorDAO.deleteById(dni);
	}

}
