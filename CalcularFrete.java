package ExercicioPOBFrete;
// calculando peso * frete
public class CalcularFrete {
	public static double calcularFreteTotal(double pesoTotal, ListaDeObjetoFrete frete) {
		return pesoTotal * frete.getPrecokg();
	}
}
