package aplicacao;

import java.util.Scanner;

public class App8 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.print("Linhas: ");
		int linha = ler.nextInt();
		System.out.print("Colunas: ");
		int coluna = ler.nextInt();
		int mat[][] = new int[linha][coluna];

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.printf("Digite da posição [%d:%d]: ", i, j);
				mat[i][j] = ler.nextInt();
			}
		}
		System.out.print("Digite um numero:");
		int x = ler.nextInt();
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] == x) {
					System.out.println("Posição [" + i + ":" + j + "] :");
					if (j > 0) {
						System.out.println("Esquerda: " + mat[i][j - 1]);
					}
					if (i > 0) {
						System.out.println("Acima: " + mat[i - 1][j]);
					}
					if (j < mat[i].length - 1) {
						System.out.println("Direita: " + mat[i][j + 1]);
					}
					if (i < mat.length - 1) {
						System.out.println("Abaixo: " + mat[i + 1][j]);
					}
				}
			}

			ler.close();
		}

	}
}
