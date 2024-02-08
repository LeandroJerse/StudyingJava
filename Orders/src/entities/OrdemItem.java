package entities;

public class OrdemItem {
	
	private Integer quantity;
	private Double price;
    private Product product;
    
	public OrdemItem(Integer quantity, Product product) {

		this.quantity = quantity;
		this.price = product.getPrice();
		this.product = product;
	}
	
	

	public Double getPrice() {
		return price;
	}



	public void setPrice(Double price) {
		this.price = price;
	}



	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	
	public Double subTotal(){
		
		return product.price * quantity;
		
	}



	@Override
	public String toString() {
		return getProduct().getName()
				+String.format(", $%.2f",getProduct().getPrice())
				+", Quantity: "+getQuantity()
				+String.format(", Subtotal: %.2f",subTotal() );
	}
	
	
}
