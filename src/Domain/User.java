package Domain;

public class User {
	private String name;
	private String lastName;
	private String adress;
	private String password;
	private String phoneNumber;
	
	public User(String name, String lastName, String adress, String password, String phoneNumber) {
		this.name = name;
		this.lastName = lastName;
		this.adress = adress;
		this.password = password;
		this.phoneNumber = phoneNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return  name+"," + lastName + "," + adress + "," + password
				+ "," + phoneNumber;
	}	
}
