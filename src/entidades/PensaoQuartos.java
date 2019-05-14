package entidades;

public class PensaoQuartos {
	
	private String nomeEstudante;
	private String emailEstudante;
	private int numQuarto;
	
	public PensaoQuartos(int numQuarto, String nomeEstudante, String emailEstudante) {
		this.nomeEstudante = nomeEstudante;
		this.numQuarto = numQuarto;
		this.emailEstudante = emailEstudante;
	}
	
	public PensaoQuartos(int numQuarto, String nomeEstudante) {
		this.nomeEstudante = nomeEstudante;
		this.numQuarto = numQuarto;		
	}

	public String getNomeEstudante() {
		return nomeEstudante;
	}

	public void setNomeEstudante(String nomeEstudante) {
		this.nomeEstudante = nomeEstudante;
	}

	public String getEmailEstudante() {
		return emailEstudante;
	}

	public void setEmailEstudante(String emailEstudante) {
		this.emailEstudante = emailEstudante;
	}

	public int getNumQuarto() {
		return numQuarto;
	}

	public void setNumQuarto(int numQuarto) {
		this.numQuarto = numQuarto;
	}
	
	
	

}
