package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidades.Dolar;

public class App1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		Dolar x;
		x = new Dolar();

		System.out.println("");
		System.out.print("Qual a cotação do dolar hoje? ");
		x.dolarCotacao = ler.nextDouble();
		System.out.print("Quantos dolares voce deseja comprar? ");
		x.retirada = ler.nextDouble();
		System.out.println("==========================================================");
		System.out.printf("A compra de %.2f dolares custara R$ %.2f\n", x.retirada, x.calculo());
		System.out.println("==========================================================");
		ler.close();
	}
	
	

}
