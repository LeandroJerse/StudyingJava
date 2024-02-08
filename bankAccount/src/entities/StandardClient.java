package entities;

public class StandardClient extends Client{
	
    private static final double INCOME = 0.1;
    
    
       
    public StandardClient(String cpf, String numberAccount, double valueInAccount) {
		super(cpf, numberAccount, valueInAccount);
	}

	public void monthlyIncome() {
    	
    	this.valueInAccount+=this.valueInAccount*INCOME;
    	
    }

	
	public String toString() {
		return "cpf:\t" + cpf + 
				"\nNumber Account:\t" + numberAccount + 
				"\nBalance:\t" + valueInAccount;
	}
	
	

	
}
