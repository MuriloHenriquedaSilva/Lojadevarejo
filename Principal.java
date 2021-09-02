
public class Principal {

	
	public static void main(String[] args) {
		
		//Cadastro Vendedor
		Vendedor vend1 = new Vendedor();
		vend1.nomeVendedor = "Claudio Araujo";
		vend1.cpf = "629.753.070-04";
		vend1.cidade = "Porto Alegre";
		vend1.bairro = "Tristeza";
		vend1.rua = "Rua A";
		vend1.numeroCasa = "3200";
		
		System.out.println("Nome do vendedor: "+vend1.nomeVendedor);
		System.out.println("CPF: "+vend1.cpf);
		System.out.println("Cidade:"+vend1.cidade);
		System.out.println("Bairro: "+vend1.bairro);
		System.out.println("Rua: "+vend1.rua);
		System.out.println("Número: "+vend1.numeroCasa);
		
		System.out.println("");
		
		//Cadastro Cliente
		Cliente client1 = new Cliente();
		client1.nomeCliente = "Amaury Júnior";
		client1.cpf = "047.653.780-04";
		client1.bairro = "Pinheiro";
		client1.rua = "Rua Goias";
		client1.numeroCasa = "522";
		
		System.out.println("Nome do Cliente: "+client1.nomeCliente);
		System.out.println("CPF: "+client1.cpf);
		System.out.println("Cidade:"+client1.cidade);
		System.out.println("Bairro: "+client1.bairro);
		System.out.println("Rua: "+client1.rua);
		System.out.println("Número: "+client1.numeroCasa);
		
		System.out.println("");
		
		Estoque estoq1 = new Estoque();
		estoq1.nomeDoProduto = 
		estoq1.nomeDoProduto = "SmartWatch";
		estoq1.pesoBruto = "10g";
		estoq1.presenteNoEstoque = "Sim";
		estoq1.quantidadeProduto = "10 000 unidades";
	}

}
