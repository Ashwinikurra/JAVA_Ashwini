package com.Streams.Filter;

import java.util.ArrayList;
import java.util.List;

class Product
{
	private int Id;
	private String name;
	private Double price;
	
	
	public Product(int id, String name, Double price) {
		super();
		Id = id;
		this.name = name;
		this.price = price;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [Id=" + Id + ", name=" + name + ", price=" + price + "]";
	}
	
}
public class Demo2 
{
   public static void main(String[] args) {
	 List<Product> productlist= new ArrayList<>();
	 productlist.add(new Product(1, "hp laptop",24900.25));
	 productlist.add(new Product(2, "dell laptop",35000.00));
	 productlist.add(new Product(3, "lenovo laptop",41000.25));
	 productlist.add(new Product(4, "sony latop",23000.50));
	 productlist.add(new Product(5, "asus laptop",20000.9));
	 productlist.add(new Product(6, "apple laptop",90000.2));
	 productlist.stream()
	            .filter(p->p.getPrice()>25000)
	            .forEach(pr->System.out.println(pr));
	 
}
}
