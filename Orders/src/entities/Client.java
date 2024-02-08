package entities;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Client {

	DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	private String name;
	private String email;
	private LocalDate birthDate;

	public Client(String name, String email, String birthDate1) {
		this.name = name;
		this.email = email;
		this.birthDate = LocalDate.parse(birthDate1,fmt1);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}
	
	@Override
	public String toString() {
		return name + "( "+ birthDate+ ") - " + email;
	}

}
