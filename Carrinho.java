package ExercicioPOBFrete;
//criando lista de carrinho
import java.util.ArrayList;
import java.util.List;

public class Carrinho {
	private List<Produto> itens;
	
	public Carrinho() {
		this.itens = new ArrayList<>();
	}
	
	public void addItem(Produto produto) {
		itens.add(produto);
	}
	public double calcularPeso() {
		double pesoTotal = 0;
		
		for(Produto item : itens) {
			pesoTotal += item.getPeso();
		}
		return pesoTotal;
	}
}
