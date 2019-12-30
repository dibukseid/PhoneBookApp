//import java.util.*;

	// Test class with main method
public class PhoneBook{
	public static void main(String [] args){
		PhoneBookEntry first = new PhoneBookEntry(5, "John", "Smith", "jsmith@gmail.edu", 20037, "2023334444"); 
		PhoneBookEntry second = new PhoneBookEntry("James", "2023443444"); 
		PhoneBookEntry third = new PhoneBookEntry("Sarah");
		first.setPhoneNumber("2025555555");
		first.printBookEntry();
		second.setZipcode(first.getZipcode());
		first.setFirstName(third.getFirstName());
		System.out.println("\n After Setting new info: ");
		System.out.println();
		first.printBookEntry();
	}
}
	
	
	