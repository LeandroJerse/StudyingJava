package Functional;

import java.text.ParseException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.OrdemItem;
import entities.Order;
import entities.OrderStatus;
import entities.Product;

public class Program {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDateTime moment = LocalDateTime.now();

		
        int numberItems;
		String name;
		String email;
		String birthday;

		
		System.out.print("Name:");
		name = sc.nextLine();

		System.out.print("Email: ");
		email = sc.next();
		System.out.print("Birth day (DD/MM/YYYY): ");
		birthday = sc.next();
		
		Client client = new Client(name, email, birthday);
		
		System.out.print("Enter order Data:\nStatus:  ");
	    OrderStatus status = OrderStatus.valueOf(sc.next()) ;
		
		Order order = new Order(moment,status,client);
		


		
		System.out.print("How many items to this order ? ");
		numberItems = sc.nextInt();
	

		
		for (int i = 0; i < numberItems; i++) {
			
	
			System.out.println("Enter #"+(i+1)+" item data: ");

			System.out.print("Product name: ");
			String nameItem = sc.next();
			System.out.print("Prudict price: ");
			double price = sc.nextDouble();
			System.out.print("Quantity: ");
			int quantity = sc.nextInt();

			
			Product product = new Product(nameItem,price);
			
			OrdemItem ordemItem = new OrdemItem(quantity,product);
			
			order.addItem(ordemItem);
			
			
			
			
		}
		
		System.out.println("ORDER SUMARY: ");
		System.out.println(order);
		


	}
}
