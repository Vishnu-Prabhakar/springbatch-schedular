package com.example.springbatch.student;


public class StudentDTO {

    private String emailAddress;
    private String name;
    private String purchasedPackage;

    public StudentDTO() {}

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getName() {
        return name;
    }

    public String getPurchasedPackage() {
        return purchasedPackage;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPurchasedPackage(String purchasedPackage) {
        this.purchasedPackage = purchasedPackage;
    }

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("StudentDTO [emailAddress=");
		builder.append(emailAddress);
		builder.append(", name=");
		builder.append(name);
		builder.append(", purchasedPackage=");
		builder.append(purchasedPackage);
		builder.append("]");
		return builder.toString();
	}

   
}
