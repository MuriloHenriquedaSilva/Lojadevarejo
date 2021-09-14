
public class Cliente {

	private String nomeCliente;
	private String cpf;
	private String rua;
	private String numeroCasa;
	private String bairro;
	private String cidade;

	// Getters
	public String getnomeCliente() {
		return this.nomeCliente;
	}

	public String getCPF() {
		return this.cpf;
	}

	public String getrua() {
		return this.rua;
	}

	public String getnumeroCasa() {
		return this.numeroCasa;
	}

	public String getbairro(String bairro) {
		return this.bairro;
	}

	public String getcidade() {
		return this.cidade;
	}

	// Setters
	public void setnumeroCasa(String numeroCasa) {
		this.numeroCasa = numeroCasa;
	}

	public void setbairro(String bairro) {
		this.bairro = bairro;
	}

	public void setcidade(String cidade) {
		this.cidade = cidade;
	}

	public void setrua(String rua) {
		this.rua = rua;
	}

	public void setnomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public void setcpf(String cpf) {
		this.cpf = cpf;
	}

	public Cliente (String nome, String cidade) {
		this.nomeCliente = nome;
		this.cidade = cidade;
	}

}
