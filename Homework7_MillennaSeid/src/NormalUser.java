
public class NormalUser extends User implements NormalUserInterface{
	
	protected int id;  
	
	
	public NormalUser(int id, String un, String pw) {
		super(un, pw);
		this.id = id;
		//this.UserDirectory = arr; 
	}
	
	
	public int addEntry(PhoneBookEntry e){
		return userDirectory.addEntry(e); 
	}

	public int edit(String fn, String ln){
		return userDirectory.edit(fn, ln); 
	}
	
	// FINISH SORT METHOD 
	public void sortDirectory(){
		userDirectory.sortDirectory();
	}
	
	public int LinearSearchByPhoneNumber(String PhoneNumber){
		return userDirectory.LinearSearchByPhoneNumber(PhoneNumber); 
	}
	
	public void displayMenu() {
		System.out.println("1. Add Entry");
		System.out.println("2. Edit Entry");
		System.out.println("3. Sort Directory");
		System.out.println("4. Search using Linear Search");
		System.out.println("5. Print Info");
		System.out.println("6. Exit");
		
	}
 
	public void printInfo() {
		System.out.println("Username: " + this.username);
		System.out.println("Password: " + this.password);
		System.out.println("ID: " + this.id);
		System.out.println();
		userDirectory.printDirectory();
	}

	
}