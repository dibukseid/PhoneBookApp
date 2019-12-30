public class User{
	protected String username; 
	protected String password; 
	protected String email; 
	protected PhoneBookDirectory userDirectory = new PhoneBookDirectory(); 
	
	public User(String un, String pw) {
		this.username = un;
		this.password = pw;
	}
	
	public int addEntry(PhoneBookEntry e) {
		return this.userDirectory.addEntry(e);
	}
	
	public void sortDirectory(){
		this.userDirectory.sortDirectory();
	}
	
	public int LinearSearchByPhoneNumber(String PhoneNumber){
		return this.userDirectory.LinearSearchByPhoneNumber(PhoneNumber); 
	}
	
	// Finish Display Menu
	public void displayMenu() {
		System.out.println("");
	}
	
 
	public void printInfo() {
		System.out.println("Username: " + this.username);
		System.out.println("Password: " + this.password);
		System.out.println();
		userDirectory.printDirectory();
	}
	
	
}