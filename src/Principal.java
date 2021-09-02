
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
		
		//Cadastro estoque
		
		Estoque estoque1 = new Estoque();
		
		estoque1.nomeDoProduto = "SmartWhatch";
		estoque1.pesoBruto = "10g";
		estoque1.presenteNoEstoque = "Sim";
		estoque1.quantidadeProduto = "10 000 unidades";
		
		System.out.println("Nome do produto: "+estoque1.nomeDoProduto);
		System.out.println("Peso: "+estoque1.pesoBruto);
		System.out.println("Está no estoque: "+estoque1.presenteNoEstoque);
		System.out.println("Quantidade: "+ estoque1.quantidadeProduto);
		
		//Cadastro do produto
		
		System.out.println("");
		
		Produtos produto1 = new Produtos();
		produto1.nomeDoProduto = "Mouse Gamer";
		produto1.valorDoProduto = "R$45,00";
		produto1.cores = "Azul,Preto,Rosa";
		System.out.print("Valor do produto: "+produto1.valorDoProduto);
		System.out.print("Cores:"+ produto1.cores);
	}

}
