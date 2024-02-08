package entities;

public class Employees {
	
	private String name;
	private Integer id;
	private Double salary;
	
	
	public Employees(Integer id,String name, Double salary) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	public void increaseSalary(double percentage) {
		this.salary += this.salary * percentage/100.00;
	}
	
	public String toString() {
		return id + "ID, "+ name +", R$"+ String.format("%.2f", salary);
	}

}
