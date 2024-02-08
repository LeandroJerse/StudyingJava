package entities;

public class Client {
	// poupança
	protected String cpf;
	protected String numberAccount;
	protected double valueInAccount;

	public Client(String cpf, String numberAccount, double valueInAccount) {
		this.cpf = cpf;
		this.numberAccount = numberAccount;
		this.valueInAccount = valueInAccount;
	}

	public String getcpf() {
		return cpf;
	}

	public void setcpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNumberAccount() {
		return numberAccount;
	}

	public void setNumberAccount(String numberAccount) {
		this.numberAccount = numberAccount;
	}

	public double getValueInAccount() {
		return valueInAccount;
	}

	public void setValueInAccount(double valueInAccount) {
		this.valueInAccount = valueInAccount;
	}

	public void increaseValue(double value) {

		this.valueInAccount += value;
	}

	public void decreaseValue(double value) {
		if (this.valueInAccount - value < 0) {
			System.out.println("There aren't enought money ");
			
		}
		else {			
		this.valueInAccount -= value;
		}
	}
	
	
}
