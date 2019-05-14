package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidades.Aluno;

public class App4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		Aluno dados;
		dados = new Aluno();
		System.out.println("");
		System.out.println("");
		System.out.print("Nome do aluno: ");
		dados.nome = ler.next();
		System.out.print("PRIMEIRA NOTA: ");
		dados.nota1 = ler.nextDouble();
		System.out.print("SEGUNDA NOTA: ");
		dados.nota2 = ler.nextDouble();
		System.out.print("TERCEIRA NOTA: ");
		dados.nota3 = ler.nextDouble();
		System.out.println("");
		System.out.printf("NOTA FINAL: %.2f",dados.notaFinal());
		if (dados.notaFinal()>60){
			System.out.print("  APROVADO");
		}else {
			System.out.printf("  REPROVADO, PRECISA DE MAIS %.2f PONTOS",60-dados.notaFinal());
		}
		
		ler.close();
	}

}
