package br.com.onzestore.sytem.communication;

import java.util.Scanner;

import br.com.onzestore.sytem.service.StockService;

public class App {

	public static void main(String[] args) {
		
      Scanner keyboard = new Scanner(System.in);
      
      Application oper = new Application();		
		
		do {
			new StockService();
			System.out.println("_______________________________________\n\n-------------OneStore------------------"
					+ "\n_______________________________________\n\n 	  SELECIONE UMA Operacao:		  "
					+ "\n\n01 - Cadastro de produto;"
					+ "\n02 - Edite o produto;"
					+ "\n03 - Estoque de produtos;"
					+ "\n04 - Deletar Produto;"
					+ "\n05 - Vender;"
					+ "\n06 - Teste;"
					+ "\n07 - cart;"
					+ "\n\n00 - SAIR"
					+ "\n----------------------------------------");
			System.out.print("Proxima operacao.: ");
			oper.setOp(keyboard.nextInt());			
			oper.opcao();
		} while (oper.getOp() != 00);
		keyboard.close();
	}
}


