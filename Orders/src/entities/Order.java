package entities;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Order {
	
	private static DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	

	private LocalDateTime moment;
	private OrderStatus status;
	private Client client;
	List<OrdemItem> items = new ArrayList<>();
	
	public Order() {
		
	}

	public Order(LocalDateTime moment, OrderStatus status, Client client) {

		this.moment = moment;
		this.status = status;
		this.client = client;
	}

	public LocalDateTime getMoment() {
		return moment;
	}

	public void setMoment(LocalDateTime moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

    public void addItem(OrdemItem item) {
    	items.add(item);
    }
	
    public void removeItem(OrdemItem item) {
    	items.remove(item);
    }
    
    public double total(){
    	
    	Double sum = 0.0;
    	for(OrdemItem item: items) {
    		sum += item.subTotal();
    	}
    	return sum;
    	
    }

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Order moment: ");
		sb.append(moment+"\n");
		sb.append("Order status: ");
		sb.append(status +"\n");
		sb.append("Client: ");
		sb.append(client + "\n");
		sb.append("Order items:\n");
		for(OrdemItem item: items) {
			sb.append(item +"\n");
			
		}
		sb.append("Total price: $");
		sb.append(String.format("%.2f", total()));
		return sb.toString();
		
		
	}
    
    
	
	
	

}
