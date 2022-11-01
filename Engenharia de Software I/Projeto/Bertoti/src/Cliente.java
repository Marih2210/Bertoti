public class Cliente {
	
	private String nome;
	private Consulta consult;
	
	public Cliente(String nome, Consulta consult) {
		this.nome = nome;
		this.consult = consult;
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Consulta getConsult() {
		return consult;
	}
	
	public void setConsult(Consulta consult) {
		this.consult = consult;
	}
	
}
