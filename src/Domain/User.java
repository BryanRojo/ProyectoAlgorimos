package Domain;

public class User {
	private String userName;
	private String name;
	private String paymentMethod;
	private String email;
	private String adress;
	private String password;
	private String phoneNumber;
	
	public User(String Username, String name,String paymentMethod, String email, String adress, String password, String phoneNumber) {
		this.userName = Username;
		this.name = name;
		this.paymentMethod = paymentMethod;
		this.email = email;
		this.adress = adress;
		this.password = password;
		this.phoneNumber = phoneNumber;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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
		return  userName+"," + name + "," + paymentMethod + "," + email + "," + adress + "," + password
				+ "," + phoneNumber;
	}	
}
