public class Consulta {

	private String numerodeProtocolo;
	private String tipoDeConsulta;
	private String dataDaConsulta;
	private String idade;
	private String sexo;
	private String rg;
	private String cpf;
	
	public Consulta(String numerodeProtocolo, String tipoDeConsulta, String dataDaConsulta, String idade, String sexo,
			String rg, String cpf) {
		this.numerodeProtocolo = numerodeProtocolo;
		this.tipoDeConsulta = tipoDeConsulta;
		this.dataDaConsulta = dataDaConsulta;
		this.idade = idade;
		this.sexo = sexo;
		this.rg = rg;
		this.cpf = cpf;
	}

	public String getNumerodeProtocolo() {
		return numerodeProtocolo;
	}
	
	public void setNumerodeProtocolo(String numerodeProtocolo) {
		this.numerodeProtocolo = numerodeProtocolo;
	}
	
	public String getTipoDeConsulta() {
		return tipoDeConsulta;
	}
	
	public void setTipoDeConsulta(String tipoDeConsulta) {
		this.tipoDeConsulta = tipoDeConsulta;
	}
	
	public String getDataDaConsulta() {
		return dataDaConsulta;
	}
	
	public void setDataDaConsulta(String dataDaConsulta) {
		this.dataDaConsulta = dataDaConsulta;
	}
	
	public String getIdade() {
		return idade;
	}
	
	public void setIdade(String idade) {
		this.idade = idade;
	}
	
	public String getSexo() {
		return sexo;
	}
	
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	public String getRg() {
		return rg;
	}
	
	public void setRg(String rg) {
		this.rg = rg;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
}
