package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidades.Funcionario;

public class App3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		Funcionario dados;
		dados = new Funcionario();
		System.out.println("");
		System.out.println("");
		System.out.print("Nome do funcionario: ");
		dados.nome = ler.next();
		
		System.out.print("Salario bruto: ");
		dados.salarioBruto = ler.nextDouble();
		
		System.out.print("Descontos legais: ");
		dados.imposto = ler.nextDouble();
		System.out.println("");
		System.out.printf("O SALÁRIO LIQUIDO É DE R$ %.2f",dados.salarioLiquido());
		System.out.println("");
		System.out.print("=========================================\n");
		System.out.print("Deseja aumento de quantos por cento no salário? ");
		dados.aumento = ler.nextDouble();
		System.out.print("=========================================\n");
		System.out.println("");
		System.out.printf("*****************************************\n");
		System.out.printf("O NOVO SALARIO FICOU EM R$ %.2f",dados.aumentoSalario()-dados.imposto);
		
		ler.close();
	}

}
