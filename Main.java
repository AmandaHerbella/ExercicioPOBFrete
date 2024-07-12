package ExercicioPOBFrete;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Carrinho carrinho = new Carrinho();//adicionando itens no carrinho
		carrinho.addItem(new Produto("Sabão", 1.5, 0.1));
		carrinho.addItem(new Produto("Detergente", 2.5, 0.5));
		carrinho.addItem(new Produto("Esponja", 0.5, 0.05));
		
		double pesoTotal = carrinho.calcularPeso(); //calculando peso do carrinho com base nos itens adds
		System.out.println("Peso total do carrinho: " + pesoTotal + "kg");
		
		System.out.println("Informe seu CEP:");//pedindo cep ao usuario
		String cep = sc.nextLine();
		
		ProcurarCEP procurarCEP = new ProcurarCEP(); //chamando a classe para procurar o cep 
		ListaDeObjetoFrete frete = procurarCEP.obterCEP(cep);
		
		if (frete != null) {//se o frete for encotnrado
			DecimalFormat df = new DecimalFormat("#.00"); //formatando o decimal
			double custoFrete = CalcularFrete.calcularFreteTotal(pesoTotal, frete);
			System.out.println("Custo do frete é: R$"+ df.format(custoFrete)); //exibindo o custo do frete
		}else {
			System.out.println("Esse CEP não foi encontrado.");
		}
		sc.close();
	}
}
