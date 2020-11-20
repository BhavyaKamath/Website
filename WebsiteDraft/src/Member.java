
public class Member {
	private String email,zip,country;

	public Member() {
		super();
	}

	public Member(String email, String zip, String country) {
		super();
		this.email = email;
		this.zip = zip;
		this.country = country;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	

}
