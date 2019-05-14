package entidades;

public class Funcionario {

	public String nome;
	public double salarioBruto;
	public double aumento;
	public double imposto;

	
	public double aumentoSalario() {
		return salarioBruto+(salarioBruto*(aumento/100));
	}
	
	public double salarioLiquido() {
		return salarioBruto - imposto;
	}
	
	
}
