package application;

import java.util.Locale;
import java.util.Scanner;

import entities.StandardClient;
import entities.VipClient;

public class Program {



	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		VipClient[] vipClient = new VipClient[5];
		StandardClient[] standardClient = new StandardClient[5];
		
        for(int i =0; i<5;i++) {
        	String cpf;
        	String numberAccount;
        	double valueInAccount;
        	System.out.println("Client "+(i+1)+" type your cpf:\t");
        	cpf=sc.nextLine();
        	System.out.println("Type your numberAccount");
        	numberAccount = sc.nextLine();
        	System.out.println("Do you want to make an initial deposit?\n\t[1]Yes\t[2]No\n");
        	int condictionalDeposit;
        	condictionalDeposit = sc.nextInt();
        	sc.nextLine();
        	if(condictionalDeposit==1) {
        		System.out.println("Deposit:\t");
        		valueInAccount = sc.nextDouble();	
        		sc.nextLine();
        	}
        	else {
        		
        		valueInAccount = 0.0;
        	}
        	
        	standardClient[i]= new StandardClient(cpf,numberAccount,valueInAccount);
        }
        
        for(int i =0; i<5;i++) {
        	String cpf;
        	String numberAccount;
        	double valueInAccount;
        	System.out.println("Client Premium "+(i+1)+" type your cpf:\t");
        	cpf=sc.nextLine();
        	System.out.println("Type your numberAccount");
        	numberAccount = sc.nextLine();
        	System.out.println("Do you want to make an initial deposit?\n\t[1]Yes\t[2]No\n");
        	int condictionalDeposit;
        	sc.nextLine();
        	
        	condictionalDeposit = sc.nextInt();
        	
        	if(condictionalDeposit==1) {
        		System.out.println("Deposit:\t");
        		valueInAccount = sc.nextDouble();
        		sc.nextLine();

        	}
        	else {
        		
        		valueInAccount = 0.0;
        	}
        	vipClient[i]= new VipClient(cpf,numberAccount,valueInAccount,1000);
        }
		

	}

}
