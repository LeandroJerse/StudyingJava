package entities;

public class Client {
    //poupança
    protected String cpf;
    protected String numberAccount;
    protected double valueInAccount;
    private static final double INCOME = 0.1;

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
    
    public void monthlyIncome() {
    	
    	this.valueInAccount+=this.valueInAccount*INCOME;
    	
    }
}
