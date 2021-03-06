public class Customer {

	private String firstName;
	private String lastName;
	private String creditCard;

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

	public String getCreditCard() {
		return creditCard;
	}

	public void setCreditCard(String creditCard) {
		this.creditCard = creditCard;
	}


	@Override
	public boolean equals(Object obj){
		System.out.println("Inside equals");
		if(obj != null && obj instanceof Customer){
			String firstName = ((Customer) obj).getFirstName();
			if(firstName!=null && firstName.equals(this.getFirstName())){
				return true;
			}
		}
		return false;
	}

	/*@Override
	public int hashCode(){
		return this.firstName.hashCode();
	}*/
}

