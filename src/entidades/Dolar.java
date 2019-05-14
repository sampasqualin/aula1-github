package entidades;

public class Dolar {

	public double iof = 0.006;
	public double dolarCotacao;
	public double retirada;
	public double valor;
	
	

public double calculo(){
	
	return (retirada * dolarCotacao) + ((retirada * dolarCotacao) * iof);
}

}