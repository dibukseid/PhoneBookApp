

public class AdminUser extends User implements AdminUserInterface{
	protected String email; 
	
	
	public AdminUser(String un, String pw, String email) {
		super(un, pw); 
		this.email = email;
		//this.userDirectory = arr; 
	}
	
	
	public int edit(String fn, String ln){
		return userDirectory.edit(fn, ln); 
	}
	
	
	public int deleteEntry(String fn, String ln) {
		return userDirectory.deleteEntry(fn, ln);
	}
	
	public PhoneBookEntry SearchbyIdBinarySearch(int id){
		return userDirectory.SearchbyIdBinarySearch(id);
	}
	
	public void setUsername(String un) {
		this.username = un;
	}
	
	public void setPassword(String pw) {
		this.password = pw;
	}
	
	public void displayMenu() {
		System.out.println("1. Add Entry");
		System.out.println("2. Edit Entry");
		System.out.println("3. Delete Entry");
		System.out.println("4. Sort Directory");
		System.out.println("5. Search using Linear Search");
		System.out.println("6. Search using Binary Search");
		System.out.println("7. Print Info");
		System.out.println("8. Change Username");
		System.out.println("9. Change Password");
		System.out.println("10. Exit");
		
	}
	
	public void printInfo() {
		System.out.println("Username: " + this.username);
		System.out.println("Password: " + this.password);
		System.out.println("Email: "+ this.email); 
		System.out.println();
		userDirectory.printDirectory();
	}
}