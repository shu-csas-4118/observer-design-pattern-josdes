package ObserverPatternDemo;

public class Professor {
	private String firstName;
	private String lastName;
	private String email;
	private int phone;
	
	public Professor(String fn, String ln, String em, int pn) {
		setFirstName(fn);
		setLastName(ln);
		setEmail(em);
		setPhone(pn);
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}
	
}
