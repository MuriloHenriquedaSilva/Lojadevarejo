
public class Principal {

	public static void main(String[] args) {

		// Cadastro Vendedor
		Vendedor vend1 = new Vendedor("Carlos Daniel", "Centro - Histórico");
		vend1.setnomeVendedor("Claudio Araujo");
		vend1.setcpf("629.753.070-04");
		vend1.setcidade("Porto Alegre");
		vend1.setbairro("Tristeza");
		vend1.setrua("Rua A");
		vend1.setnumeroCasa("3200");

		System.out.println("Nome do vendedor: " + vend1.getnomeVendedor());
		System.out.println("CPF: " + vend1.getcpf());
		System.out.println("Cidade:" + vend1.getCidade());
		System.out.println("Bairro: " + vend1.getbairro());
		System.out.println("Rua: " + vend1.getRua());
		System.out.println("Número: " + vend1.getnumeroCasa());

		System.out.println("");

		// Cadastro Cliente
		Cliente client1 = new Cliente("Rodrigo ","Porto Alegre");
		 client1.setnomeCliente("Amaury Júnior") ;
		 client1.setcpf("047.653.780-04");
		client1.setbairro("Pinheiro");
		client1.setrua("Rua Goias");
		client1.setnumeroCasa("522");
		client1.setcidade("Porto Alegre");

		System.out.println("Nome do Cliente: " + client1.getnomeCliente());
		System.out.println("CPF: " + client1.getCPF());
		System.out.println("Cidade:" + client1.getcidade());
		System.out.println("Bairro: " + client1.getbairro(null));
		System.out.println("Rua: " + client1.getrua());
		System.out.println("Número: " + client1.getnumeroCasa());

		System.out.println("");

		// Cadastro estoque

		Estoque estoque1 = new Estoque("Fone de ouvido","1g");

		estoque1.setnomeDoProduto("SmartWhatch");
		estoque1.setpesoBruto("10g") ;
		estoque1.setpresenteNoEstoque("Sim");
		estoque1.setquantidadeProduto("10 000 unidades");

		 System.out.println("Nome do produto: " + estoque1.getnomeDoProduto());
		 System.out.println("Peso: " + estoque1.getpesoBruto());
		System.out.println("Está no estoque: " + estoque1.getpresenteNoEstoque());
		System.out.println("Quantidade: " + estoque1.getquantidadeProduto());

		// Cadastro do produto

		System.out.println("");

		Produtos produto1 = new Produtos("Azul","R$150,00");
		 produto1.setnomeDoProduto("Mouse Gamer");
		 produto1.setvalorDoProduto("R$45,00") ;
		 produto1.setcores( "Azul,Preto,Rosa");

		System.out.print("Valor do produto: " + produto1.getvalorDoProduto());
		System.out.print("Cores:" + produto1.getcores());
	}

}
