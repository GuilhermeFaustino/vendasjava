package br.com.onzestore.sytem.service;

import java.util.Scanner;

import br.com.onzestore.sytem.data.CartData;
import br.com.onzestore.sytem.data.StockData;
import br.com.onzestore.sytem.model.Product;
import br.com.onzestore.sytem.model.Cart;

public class CartService {

    StockData stock = new StockData();
    CartData cartData = new CartData();

    Cart cart = new Cart();
    Product product = new Product();
    Scanner sc = new Scanner(System.in);

    public String addCart(String sku, String cpf) {
        String prodStock = "";
        product = stock.returnProduct(sku);
        if(product != null) {
            cart = new Cart();
            cart.setSku(sku);
            cart.setCpf(cpf);
            cart.setName(product.getDescription());
            cart.setQuantity(product.getQuantity());
            cart.setPrice(product.getValue());
            cartData.save(cart);
            System.out.println(prodStock = "Produto Adicionado no Carrinho\n");
            System.out.println(listCart());
            updateCart();
        }else{
            prodStock = "Sku nao exite favor escolher outro";
        }
        return prodStock;
    }

    public String listCart() {
        String returnProduct = "";
        for (String c : cartData.returnCart().keySet()){
            Cart cart = cartData.returnProductCart(c);
            returnProduct += "SKU: " + c + ", Produto, " + cart.getName() + " Quantidade, " + cart.getQuantity() + " Valor, R$ " + cart.getPrice() + ".\n";
            cartData.returnStock();
        }
        return returnProduct;
    }
    public void upProdcutCart(String sku, int qtd){
        String prodStock = "";
        product = stock.returnProduct(sku);
        for(String upProduct : cartData.returnCart().keySet()) {
            product = stock.returnProduct(sku);
            if(product.getSku().equals(sku)){
                cart = new Cart();
                cart.setSku(sku);
                cart.setName(product.getDescription());
                cart.setQuantity(qtd);
                cart.setPrice(product.getValue());
                cartData.update(cart);
            }
        }
        System.out.println(listCart());
    }

    public void delProductCart(String sku2){
       if(cartData.returnProductCart(sku2) != null){
           cartData.delete(sku2);
           System.out.println("Produto Removido com sucesso");
       }else{
           System.out.println("Opa,... Sku nao existe");
       }
        System.out.println(listCart());
    }

    public void updateCart() {
        String esc;
        do {
            System.out.println("O que Deseja fazer ?\n");
            System.out.println("1 - Adicionar novo Produto ?");
            System.out.println("2 - Editar Produto ?");
            System.out.println("3 - Excluir Produto ?");
            System.out.println("4 - Sair.\n");
            esc = sc.next();

            switch (esc) {
                case "1" -> {
                    System.out.println("Digite o Sku para Adicionar");
                    String updateSku = sc.next();
                    String cpf = "";
                    addCart(updateSku, cpf);
                    break;
                }
                case "2" -> {
                    System.out.println("Digite o Sku para Editar");
                    String updateSku = sc.next();
                    System.out.println("Digite a quantidade do produto");
                    int qtd = sc.nextInt();
                    upProdcutCart(updateSku, qtd);
                    break;
                }
                case "3" -> {
                    System.out.println("Digite o Sku para Excluir");
                    String delProduct = sc.next();
                    delProductCart(delProduct);
                    break;
                }
            }

        }while(!esc.equals("4"));
    }
}































