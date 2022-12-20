package br.com.onzestore.sytem.data;

import java.util.HashMap;

import br.com.onzestore.sytem.model.Product;
import br.com.onzestore.sytem.model.Cart;

public class StockData implements DataInterface{		
	
	private static final HashMap<String, Product> stock = new HashMap<>();
	

	public void save(Object obj) {	
		Product product = (Product) obj;
		stock.put(product.getSku(), product);
	}
	
	public void update(Object obj) {
		Product product = (Product) obj;
		stock.put(product.getSku(), product);
	}

	
	public boolean delete(Object obj) {
		stock.remove(obj);
		return true;
	}

	public HashMap<String, Product> returnStock() {
		return stock;			
	}
	
	public Product returnProduct(String sku) {
		return stock.get(sku);
	}

	@Override
	public HashMap<String, Cart> returnCart() {
		return null;
	}

	

}
