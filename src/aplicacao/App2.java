package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidades.Retangulo;

public class App2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		Retangulo valor;
		valor = new Retangulo();
		System.out.print("===========================\n");
		System.out.print("Digite a LARGURA: ");
		valor.largura = ler.nextDouble();
		System.out.print("Digite a ALTURA: ");
		valor.altura = ler.nextDouble();
		System.out.print("===========================\n");
		System.out.printf("AREA: %.2f\n",valor.area());
		System.out.printf("PERIMETRO: %.2f\n",valor.perimetro());
		System.out.printf("DIAGONAL: %.2f\n",valor.diagonal());
		
		ler.close();
	}

}
