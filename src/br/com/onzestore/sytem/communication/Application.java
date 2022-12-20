package br.com.onzestore.sytem.communication;

import java.util.Scanner;

import br.com.onzestore.sytem.service.CartService;
import br.com.onzestore.sytem.service.StockService;

public class Application {
	
Scanner keyboard = new Scanner(System.in);
	
	StockService service = new StockService();
	CartService cart = new CartService();
	private Integer op;

	public Integer getOp() {
		return op;
	}

	public void setOp(Integer op) {
		this.op = op;
	}
  
			public void opcao() {		 
				switch (op) {		
				case 1:				
					System.out.println("Informe o Sku do Produto: ");
					String sku = keyboard.next();

					System.out.println("Nome do Produto: ");
					keyboard.nextLine();
					String des = keyboard.nextLine();					
					System.out.println("Quantidade do Produto: ");
					Integer qtd = keyboard.nextInt();
					System.out.println("Valor do Produto: ");
					double vlue = keyboard.nextDouble();
					System.out.println(service.saveProduct(sku, qtd, des, vlue));
				break;
				case 2:
					System.out.println("Digite o Sku do Produto que deseja Alterar");
					String codSku = keyboard.next();

					System.out.println("Nome do Produto: ");
					keyboard.nextLine();
					String description = keyboard.nextLine();					
					System.out.println("Quantidade do Produto: ");
					Integer qtd2 = keyboard.nextInt();
					System.out.println("Valor do Produto: ");
					Double vle = keyboard.nextDouble();
					service.productUpdate(codSku, qtd2, description, vle);
					System.out.println(service.stockList());
				break;
				case 3:
					System.out.print("##################-------Estoque de Produtos---#########################\n\n");
					System.out.println(service.stockList());
					System.out.print("#############################----FIM----################################\n\n\n");					
				break;
				case 4:
					System.out.println("Digite o Sku do Produto.");
					String sku3 = keyboard.nextLine();
					service.deleteProduct(sku3);

					System.out.println("Lista de Produtos Disponiveis.");
					System.out.println(service.stockList());
				break;
				case 5:	
					System.out.println("Deseja Colocar O Cpf na Nota S/N ?");
					String escCpf = keyboard.next();
					if(escCpf.equals("s")) {	
						System.out.println("Digite o CPF ?");
						String cpf = keyboard.next();
						
						System.out.println("Digite o SKU do Produto ?");
						String  proSku = keyboard.next();
					    System.out.println(cart.addCart(proSku, cpf));
					}else {
						System.out.println("Digite o sku do Produto ?");
						String skuProd = keyboard.next();
						String cpf = "";
					   System.out.println(cart.addCart(skuProd, cpf));	
					}						
				break;
				case 6:					
					System.out.println("Buscar o Produto, Digite o Sku: ");
					//long prodSku = keyboard.nextLong();
					//sales.salesProduct(prodSku);				
				break;
				case 7:					
					cart.listCart();		
				break;
				default:
					System.out.println("Digite opção Valida do Menu.");
		
				}
			}
}

