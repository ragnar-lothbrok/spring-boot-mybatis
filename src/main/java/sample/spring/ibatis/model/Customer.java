package sample.spring.ibatis.model;


public class Customer {

	private int customerId;
	private String firstName;
	private String lastName;
	private String mobileNo;
	
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
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
	
	public String getMobileNo() {
		return mobileNo;
	}	
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("\nCustomer : id = ").append(customerId).append(" ");
		sb.append(" name  = ").append(firstName).append(" ").append(lastName);
		sb.append(" Mobile : ").append(mobileNo);
		return sb.toString(); 
	}
	
	public String toXML(){
	    StringBuffer sb = new StringBuffer();
	    sb.append("<customer>")
	        .append("<firstName>"+firstName+"</firstName>")
	        .append("<lastName>"+lastName+"</lastName>")
            .append("<mobileNo>"+mobileNo+"</mobileNo>")
            .append("<customerId>"+customerId+"</customerId>")
            .append("</customer>");
	    return sb.toString();
	}

}
