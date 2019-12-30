
public class PhoneBookEntry implements Comparable<PhoneBookEntry>{
	
	// my private variables 
	private int id; 
	private String firstName; 
	private String lastName; 
	private String email; 
	private int zipcode; 
	private String phoneNumber; 
	
	// no args constructor
	public PhoneBookEntry(){
		this.id = -1; 
	}
	
	// constructor 1 
	public PhoneBookEntry(int id, String fn, String ln, String email, int zip, String phone) {
		this.id = id; 
		this.firstName = fn; 
		this.lastName = ln; 
		this.email = email; 
		this.zipcode = zip;  
		this.phoneNumber = phone;  
	}
	
	// constructor 2 
	public PhoneBookEntry(String fn, String phone) {
		this.firstName = fn; 
		this.phoneNumber = phone; 
	}
	
	// constructor 3
	public PhoneBookEntry(String fn){
		this.firstName = fn;  
	}
	
	// All the getters for the private variables 
	public int getID() {
		return this.id; 
	}
	public String getFirstName() {
		return this.firstName; 
	}
	
	public String getLastName() {
		return this.lastName; 
	}
	
	public String getEmail() {
		return this.email; 
	}
	
	public int getZipcode() {
		return this.zipcode;
		
	}
	
	public String getPhoneNumber() {
		return this.phoneNumber; 
	}
	
	// All the setters
	
	public void setID(int newID) {
		this.id = newID; 
	}
	
	public void setFirstName(String fn) {
		this.firstName = fn; 
	}
	
	public void setLastName(String ln) {
		this.lastName = ln;
	}
	
	public void setEmail(String email) {
		this.email = email; 
	}
	
	public void setZipcode(int zip) {
		this.zipcode = zip;
	}
	
	public void setPhoneNumber(String phone) {
		this.phoneNumber = phone; 
	}
	
	// print all info method
	public void printBookEntry() {
		System.out.println("ID: " + this.id);
		System.out.println("First Name: " + this.firstName);
		System.out.println("Last Name: " + this.lastName);
		System.out.println("Email: " + this.email);
		System.out.println("Zipcode: " + this.zipcode);
		System.out.println("Phone Number: " + this.phoneNumber);
	}
	
	//This compareTo method overrides the Comparable interface method
	// This override is required for exercise 2 not Exercise 1 but 
	// I decided to override it in this class
	@Override
	public int compareTo(PhoneBookEntry e) {
		if (e.getID() > this.id) {
			return 1; 
		
		}else if (e.getID() < this.id) {
			return -1; 
		}else {
			return 0; 
		}
	}

}