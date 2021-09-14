
public class Produtos {
	private  String nomeDoProduto;
	private  String cores;
	private  String valorDoProduto;
	
	//Getters
	
	public String getnomeDoProduto() {
		return this.nomeDoProduto;
	}
	public String getcores() {
		return this.cores;
	}
	
	public String getvalorDoProduto() {
		return this.valorDoProduto;
	}
	
	public void setvalorDoProduto(String valorDoProduto) {
		this.valorDoProduto = valorDoProduto;
	}
	public void setnomeDoProduto(String nomeDoProduto) {
		this.nomeDoProduto = nomeDoProduto;
	}
	public void setcores(String cores) {
		this.cores = cores;
	}
	public Produtos (String cores, String valor) {
		this.cores = cores;
		this.valorDoProduto = valor;
	}
}
