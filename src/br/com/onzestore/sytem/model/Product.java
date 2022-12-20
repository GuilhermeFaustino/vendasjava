package br.com.onzestore.sytem.model;

import br.com.onzestore.sytem.enums.*;

public class Product {
	
	private String sku;
	private String description;
	private String category;
	private Double value;
	private String descricao;
	private String type;
	private String size;
	private String department;
	private Integer quantity;


	/***/
	private int cod;
	private CategoriaEnum categoria;
	private CorEnum color;
	private DepartamentoEnum departamento;
	private TamanhoEnum tamanho;
	private TipoEnum tipo;



	/***/
	
	
	public String getSku() {

		return sku;
	}
	public void setSku(String sku) {

		this.sku = sku;
	}	
	public String getDescription() {

		return description;
	}
	public void setDescription(String description) {

		this.description = description;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(CategoriaEnum category) {

		this.category = String.valueOf(category);
	}
	public Double getValue() {

		return value;
	}
	public void setValue(Double value) {
		this.value = value;
	}

	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	/***/

	public int getCod() {
		return cod;
	}

	public DepartamentoEnum getDepartamento() {
		return departamento;
	}

	public void setDepartamento(DepartamentoEnum departamento) {
		this.departamento = departamento;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public CategoriaEnum getCategoria() {
		return categoria;
	}

	public TamanhoEnum getTamanho() {
		return tamanho;
	}

	public TipoEnum getTipo() {
		return tipo;
	}
	public CorEnum getColor() {
		return color;
	}
	/**/
}
