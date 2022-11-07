package pt.dneves.shopping.app.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Product implements Cloneable { //implements Comparable<Product> {

	// TODO COLCOAR ESTE exemplos - constantes
//	private final String XPTO;
	
	private int id = -1;
	private String name;
	private BigDecimal price;
	private LocalDate bestBefore;

	protected BigDecimal discount;
	

	public Product() {
		// do nothing
//		super();
	}

	public Product(String name) {
		this.name = name;
	}
	
	public Product(int id, String name, BigDecimal price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public Product(int id, String name, BigDecimal price, LocalDate bestBefore) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.bestBefore = bestBefore;
	}
	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getPrice() {
		return price;
	}
	
	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public LocalDate getBestBefore() {
		return bestBefore;
	}
	
	public void setBestBefore(LocalDate bestBefore) {
		this.bestBefore = bestBefore;
	}
	
	public void applyDiscound(BigDecimal value) {
		
		if(BigDecimal.ZERO.compareTo(value) == 0
				|| BigDecimal.ZERO.compareTo(value) == -1) {
			
			return;
		}
		
		
		BigDecimal priceDiscount = this.price.subtract(value);
		
		this.price = priceDiscount.intValue() < 0 
				? BigDecimal.valueOf(0) 
				: priceDiscount;
		
	}
	
	protected void overrideAccessModifier() {
		// do nothing
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		
//		if(!(this instanceof Cloneable)) {
//			throw new CloneNotSupportedException();
//		}
		
		return super.clone();
		
	}
	
	@Override
	public boolean equals(Object obj) {
		return name.equals(((Product)obj).getName());
	}
	
	@Override
	public int hashCode() {
		return this.name.hashCode();
	}

}
