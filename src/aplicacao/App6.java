package aplicacao;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

import entidades.PensaoQuartos;

public class App6 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		System.out.print("Quantos quartos serão alugados? ");
		int n = ler.nextInt();

		PensaoQuartos[] vet = new PensaoQuartos[n];
		for (int i = 0; i < n; i++) {

			System.out.print("Numero do quarto: ");
			int numQuarto = ler.nextInt();
			ler.nextLine();
			System.out.print("Nome: ");
			String nomeEstudante = ler.nextLine();
			System.out.print("Email: ");
			String emailEstudante = ler.nextLine();

			vet[i] = new PensaoQuartos(numQuarto, nomeEstudante, emailEstudante);
		}
		System.out.printf("\n===============\n");
		
		for (int i = 0; i < n; i++) {
			
			System.out.printf("QUARTO:");
			System.out.print(vet[i].getNumQuarto());
			System.out.printf("\nHOSPEDE:");
			System.out.print(vet[i].getNomeEstudante());
			System.out.printf("\nE-mail:");
			System.out.print(vet[i].getEmailEstudante());
			System.out.printf("\n===============\n");

		}

		ler.close();
	}

}
