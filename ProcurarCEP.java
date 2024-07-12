package ExercicioPOBFrete;

import java.util.HashMap;
import java.util.Map;

public class ProcurarCEP {
	private Map<String, ListaDeObjetoFrete> fretesClientes;
	
	public ProcurarCEP() {
		fretesClientes = new HashMap<>();
		
		fretesClientes.put("10000-000", new ListaDeObjetoFrete("100000-000", 9.0)); //add ceps e seus respectivos pesos
		fretesClientes.put("20000-000", new ListaDeObjetoFrete("200000-000", 8.0));
	}
	public ListaDeObjetoFrete obterCEP (String cep) {
		return fretesClientes.get(cep);
	}
	
}
