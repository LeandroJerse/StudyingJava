package entities;

public class Token {

	private String name;
	private int age;
	private double height;
	
	public Token(String name, int age, double height) {
		super();
		this.name = name;
		this.height = height;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getHeight() {
		return height;
	}



	public double getAge() {
		return age;
	}
	
	
	public double alturaMedia(double altura, int numberPersons) {
		return altura/ (double)numberPersons;
	}
	public double menorIdadeMedia(double menorIdade, int numberPersons) {
		return menorIdade/(double)numberPersons;
	}


	
	
	
	
}
