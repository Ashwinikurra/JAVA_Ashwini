package com.Streams.Map;

import java.util.Arrays;
import java.util.List;

class Product
{
	private String name;
	private int id;
	private double price;
	
	public Product(String name, int id, double price) {
		super();
		this.name = name;
		this.id = id;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [name=" + name + ", id=" + id + ", price=" + price + "]";
	}
	
}
public class ParallelStream 
{
  public static void main(String[] args) {
	List<Product> product= Arrays.asList(new Product("mobile", 1023, 10000.50),
			new Product("hp", 4587, 410000.15),
			new Product("oppo", 1598, 18500.00),
			new Product("buds", 7536, 50000.85),
			new Product("mouse", 1234, 30000.95)
			);
	// strems
	 product.stream().filter(p->p.getPrice()>5000).limit(3)
	          .forEach(p->System.out.println(p.getId()+ " "+p.getName()+ " "+p.getPrice()));
	//parallel streams
	 System.out.println("parallel streams");
	product.parallelStream().filter(p->p.getPrice()>5000).limit(3).forEach(p->System.out.println(p.getId()+ " "+p.getName()+ " "+p.getPrice()));
    System.out.println("Converting stream to Parallel Streams");
    product.stream().parallel().filter(p->p.getPrice()>5000).limit(3)
             .forEach(p->System.out.println(p.getId()+ " "+p.getName()+ " "+p.getPrice()));
     
  }
}
