package com.spring.springcore._09.autowiring;

public class Customer {
	
	private String customerName;

	private Product product;
	
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	
	public String getCustomerProductName(){
		return product.getProductName();
	}
	

}
