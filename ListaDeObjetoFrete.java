package ExercicioPOBFrete;
//preço do kg baseado no frete
public class ListaDeObjetoFrete {
	private String cep;
	private double precokg;
	
	public ListaDeObjetoFrete(String cep, double precokg) {
		this.cep = cep;
		this.precokg = precokg;
	}

	public String getCep() {
		return cep;
	}

	public double getPrecokg() {
		return precokg;
	}
}
