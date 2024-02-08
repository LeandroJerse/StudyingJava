package entities;

public class VipClient extends Client{
	
    private static final double INCOME = 0.15;
    private double limit;
    
	public VipClient(String cpf, String numberAccount, double valueInAccount, double limit) {
		super(cpf, numberAccount, valueInAccount);
		this.limit = limit;
	}
	
	public void decreaseValue(double value) {
		if (this.valueInAccount - value < 0) {
			System.out.println("There aren't enought money ");
			
		}
		else {			
		this.valueInAccount -= value;
		}
	}
	
	public void decreaseValue(double value,VipClient possibleLimite) {
		
		if (this.valueInAccount - value < possibleLimite.limit) {
			System.out.println("There aren't enought money ");
			
		}
		else {			
		this.valueInAccount -= value;
		}
	}
	
	public String toString() {
		return "cpf:\t" + cpf + 
				"\nNumber Account:\t" + numberAccount + 
				"\nBalance:\t" + valueInAccount
				+"\nLimit:\t"+limit;
	}
    
    
    

	

}
