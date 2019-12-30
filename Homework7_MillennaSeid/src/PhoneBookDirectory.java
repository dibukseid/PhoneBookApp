import java.util.Scanner;

public class PhoneBookDirectory{
	PhoneBookEntry [] allUsers; 
	private int count = 0;
	
	public PhoneBookDirectory(){
		this.allUsers = new PhoneBookEntry [6];
	}
	
	Scanner input = new Scanner(System.in);
	
	//PhoneBookEntry [] allUsers = new PhoneBookEntry [6];
	 
	
	public int addEntry(PhoneBookEntry entry) {
		if(count > allUsers.length) {
			return 0; 
		}
		allUsers[count] = entry; 
		count++; 
		return 1; 
	
	}

	
	public int LinearSearchByPhoneNumber(String PhoneNumber) {
		
		for (int i = 0; i < count; i++) {
			if(allUsers[i].getPhoneNumber().equals(PhoneNumber)) {
				return 1; 
			}
		}
		return 0; 
	}
	
	public PhoneBookEntry SearchbyIdBinarySearch(int id) {
		this.sortDirectory();
		
		int l = 0;  
		int h = count-1; 
		int m; 
		
		while(l<=h){
			m = (l+h)/2; 
			if(allUsers[m].getID() == id){
				return allUsers[m];
			}else if(allUsers[m].getID() < id) {
				l = m+1;
			}else {
				h = m-1;
			}
		
		}
		return new PhoneBookEntry (null);
	}
		
		/*
		int mid = allUsers.length/2; 
		
		if(id == allUsers[mid].getID()) {
			return allUsers[mid]; 
			
		}else if(id > allUsers[mid].getID()) {
			for (int i = mid; i < allUsers.length; i++) {
				if(allUsers[i].getID() == id) {
					return allUsers[i]; 
				}
				
			}
			PhoneBookEntry empty = new PhoneBookEntry();
			empty = null; 
			return empty; 
			
		}else {
			if(id < allUsers[mid].getID()) {
				for (int i = mid; i > 0; i--) {
					if(allUsers[i].getID() == id) {
						return allUsers[i]; 
					}
				}
			}	
		}
		PhoneBookEntry empty = new PhoneBookEntry();
		empty = null; 
		return empty;
	}
	
	*/

	
	public void sortDirectory() {
		int result = 0; 
		for(int i = 0; i < count-1; i++) {
			PhoneBookEntry min = allUsers[i]; 
			for (int j = i+i; j < count; j++) {
				result = min.compareTo(allUsers[j]); 
				if (result == 1) {
					allUsers[i] = allUsers[j]; 
					allUsers[j] = min; 
				}
			}
		}
	}

	public int edit(String fn, String ln) {
		int choice; 
		for (int i = 0; i < count; i++) {
			if(allUsers[i].getFirstName().equalsIgnoreCase(fn) && allUsers[i].getLastName().equalsIgnoreCase(ln)) {
				System.out.println("What would you like to edit?: ");
				System.out.println("1. Edit First Name");
				System.out.println("2. Edit Last Name");
				System.out.println("3. Edit ID");
				System.out.println("4. Edit Email");
				System.out.println("5. Edit Zipcode");
				System.out.println("6. Edit Phone Number");
				
				choice = input.nextInt(); 
				
				switch(choice) {
					
					case 1:
						System.out.println("Enter new first name: ");
						String name = input.next(); 
						allUsers[i].setFirstName(name);
						return 1;
					case 2:
						System.out.println("Enter new last name: ");
						String lastName = input.next(); 
						allUsers[i].setLastName(lastName);
						return 1;
					case 3: 
						System.out.println("Enter new ID: ");
						int id = input.nextInt(); 
						allUsers[i].setID(id);
						return 1;
					case 4: 
						System.out.println("Enter new email: ");
						String email = input.next(); 
						allUsers[i].setEmail(email);
						return 1;
					case 5: 
						System.out.println("Enter new zipcode: ");
						int zipcode = input.nextInt(); 
						allUsers[i].setZipcode(zipcode);
						return 1;
					case 6: 
						System.out.println("Enter new phone number: ");
						String phone = input.next(); 
						allUsers[i].setPhoneNumber(phone);
						return 1;
				} 
			}
		}
	return 0;
	
	}
	
	// FINISH DELETE METHOD 
	
	
	public int deleteEntry(int id) {
		
		for(int i = 0; i < count; i++){
			if(allUsers[i].getID() == id) {
				allUsers[i].setID(0);
				allUsers[i].setEmail("");
				allUsers[i].setFirstName("");
				allUsers[i].setLastName("");
				allUsers[i].setPhoneNumber("");
				allUsers[i].setZipcode(0);
				return 1; 
			}

		}
		return 0; 
	}
	
	
	public int deleteEntry(String fn, String ln){
		for(int i = 0; i < count; i++){
			if(allUsers[i].getFirstName().equalsIgnoreCase(fn) && allUsers[i].getLastName().equalsIgnoreCase(ln)) {
				allUsers[i].setID(0);
				allUsers[i].setEmail("");
				allUsers[i].setFirstName("");
				allUsers[i].setLastName("");
				allUsers[i].setPhoneNumber("");
				allUsers[i].setZipcode(0);
					
				return 1; 
			}

		}
		return 0; 
	}
	
	public void printDirectory() {
		for(int i = 0; i < count; i++) {
			if(allUsers[i].getFirstName().equals(""))
				continue;
			allUsers[i].printBookEntry();
		}
	}
	
}
