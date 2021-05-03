package Entities;

public class Customer {
	
	private int id;
	private String firstName;
	private String lastName;
	private int nationalityId;
	private int birthYear;
	
	
	public Customer(int id, String firstName, String lastName, int nationalityId, int birthYear) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.nationalityId = nationalityId;
		this.birthYear = birthYear;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public int getNationalityId() {
		return nationalityId;
	}


	public void setNationalityId(int nationalityId) {
		this.nationalityId = nationalityId;
	}


	public int getBirthYear() {
		return birthYear;
	}


	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	

}
