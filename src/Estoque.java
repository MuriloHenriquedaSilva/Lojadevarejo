
public class Estoque {

	private  String quantidadeProduto;
	private  String pesoBruto;
	private  String presenteNoEstoque;
	private  String nomeDoProduto;

	//Getters
	
	public String getquantidadeProduto() {
		return this.quantidadeProduto;
	}
	
	public String getpesoBruto() {
		return this.pesoBruto;
	}
	
	public String getpresenteNoEstoque( ) {
		return this.presenteNoEstoque;
	}
	
	public String getnomeDoProduto() {
		return this.nomeDoProduto;
	}
	
	
	//Setters
	public void setquantidadeProduto(String quantidadeProduto) {
		this.quantidadeProduto = quantidadeProduto;
	}
	
	public void setpresenteNoEstoque(String presenteNoEstoque) {
		this.presenteNoEstoque = presenteNoEstoque;
	}

	public void setnomeDoProduto(String nomeDoProduto) {
		this.nomeDoProduto = nomeDoProduto;
	}

	public void setpesoBruto(String pesoBruto) {
		this.pesoBruto = pesoBruto;
	}
	
	public Estoque (String nome, String peso) {
		this.nomeDoProduto = nome;
		this.pesoBruto = peso;
	}
}
