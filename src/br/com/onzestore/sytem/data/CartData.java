package br.com.onzestore.sytem.data;

import java.util.HashMap;

import br.com.onzestore.sytem.model.Product;
import br.com.onzestore.sytem.model.Cart;

public class CartData implements DataInterface {

	private static HashMap<String, Cart> cart = new HashMap<>();

	public void save(Object obj) {
		Cart saveCart = (Cart) obj;
		cart.put(saveCart.getSku(), saveCart);
	}

	public void update(Object obj) {
		Cart upCart = (Cart) obj;
		cart.put(upCart.getSku(), upCart);
	}

	public boolean delete(Object obj) {
		cart.remove(obj);
		return true;
	}


	@Override
	public HashMap<String, Product> returnStock() {

		return null;
	}

	@Override
	public HashMap<String, Cart> returnCart() {

		return cart;
	}
	
	public Cart returnProductCart(String sku) {

		return cart.get(sku);
	}

}
