package br.com.onzestore.sytem.service;
import br.com.onzestore.sytem.data.StockData;
import br.com.onzestore.sytem.enums.CategoriaEnum;
import br.com.onzestore.sytem.enums.DepartamentoEnum;
import br.com.onzestore.sytem.model.Product;

public class StockService {
	
	StockData stock = new StockData();
	Product product = new Product();
	//HashMap<Long, Product> stock = data.returnList();
	
	
	public String saveProduct(String sku, Integer quantity, String description, Double value) {
		product = new Product();
    	String cadastro = "";
		product.setSku(sku);
		product.setQuantity(quantity);
		product.setDescription(description);
		product.setValue(value);
		if(stock.returnProduct(sku) != null) {
			System.out.println("Produto de " + product.getSku() + ", já Cadastrado favor verificar.");
		}else {
			stock.save(product);			
			cadastro = "\nO Produto " +" Sku: " + CategoriaEnum.ROUPAS.getRef() + " - " + product.getDescription() + ", de Quantidade: " + product.getQuantity()+ " e Valor R$: " + product.getValue() + ", foi cadastrado com Sucesso!.\n";
			
		}		
		return cadastro;
	}
	
	

	public String listProduct(long sku, Integer quantity, String description) {
		product.setQuantity(quantity);
		product.setDescription(description);
		String returnProduct = "O Produto cadastro foi: " + product.getDescription() + ", Quantidade: " + product.getQuantity();
		stock.returnStock();
		return returnProduct;		
	}
	
	public String stockList() {		
		String returnProduct  = "";
		for(String key : stock.returnStock().keySet()) {
			Product product = stock.returnProduct(key);
			returnProduct += "SKU: " + key + ", Produto, " + product.getDescription() + " Quantidade, " + product.getQuantity() + " Valor, R$ " + product.getValue() + ".\n";
			stock.returnStock();
		}
		return returnProduct;
	}
	
	public String productUpdate(String sku, Integer quantity, String description, Double vle) {
		String updateProduct = "";
		for(String key : stock.returnStock().keySet()) {
			Product value = stock.returnProduct(key);
			if(value.getSku().equals(sku)) {
		    	value.setQuantity(quantity);
		    	value.setDescription(description);
		    	value.setValue(vle);
		    	stock.update(value);
		    	updateProduct  = "SKU " + product.getSku() + ". Quantidade: " + product.getQuantity() + " Descrição: " + product.getDescription();		    	
		    }	
			
        }
		return updateProduct;
	}

	
	public void deleteProduct(String sku) {
		if(stock.returnProduct(sku) != null) {
			stock.delete(sku);
			System.out.println("Produto Removido com sucesso");
		}else {
			System.out.println("Opa,... Sku nao existe");
		}
	}	
	
}
