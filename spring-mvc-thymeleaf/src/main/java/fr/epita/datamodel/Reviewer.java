package fr.epita.datamodel;

import java.time.LocalDate;

public class Reviewer {
	
	private String name;
	private LocalDate birthDate;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

}
