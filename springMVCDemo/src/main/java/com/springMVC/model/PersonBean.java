package com.springMVC.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="person")
public class PersonBean {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name="firstName")
	private String firstName;
	@Column(name="lastName")
	private String lastName;
	/*@Embedded
	private AddressBean address;
	@ElementCollection
	private ArrayList<AccountBean> account;*/
	@Column(name="phone")
	private String phnmbr;
	private int age;
	

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
/*	public AddressBean getAddress() {
		return address;
	}
	public void setAddress(AddressBean address) {
		this.address = address;
	}
	public ArrayList<AccountBean> getAccount() {
		return account;
	}
	
	public void setAccount(ArrayList<AccountBean> account) {
		this.account = account;
	}*/
	public String getPhnmbr() {
		return phnmbr;
	}
	public void setPhnmbr(String phnmbr) {
		this.phnmbr = phnmbr;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "PersonBean [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", phnmbr=" + phnmbr
				+ ", age=" + age + "]";
	}
	
	
	
	
	

}
