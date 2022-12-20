package br.com.onzestore.sytem.data;

import java.util.HashMap;

import br.com.onzestore.sytem.model.Product;
import br.com.onzestore.sytem.model.Cart;

public interface DataInterface {
	void save(Object obj);
	void update (Object obj);
	boolean delete(Object obj);
	HashMap<String, Product> returnStock();
	HashMap<String, Cart> returnCart();
}
