import java.util.*;
//import java.lang.*;
import java.io.*;




public class PhoneBookApp{
	public static void main(String [] args) throws FileNotFoundException {
		Scanner input = new Scanner(System.in); 
		
		File f1 =  new File("admin.txt"); 
		Scanner first = new Scanner(f1);
		String resultf1 = first.nextLine();
		String [] arrayf1 = resultf1.split(","); 
		
		File f2 = new File("user.txt"); 
		Scanner second = new Scanner(f2); 
		String resultf2 = second.nextLine();
		String [] arrayf2 = resultf2.split(",");
		int normalID = Integer.parseInt(arrayf2[0]);
		
		String admin_name = arrayf1[0];
		String admin_pw = arrayf1[1];
		String admin_email = arrayf1[2];
		
		String normal_name = arrayf2[1];
		String normal_pw = arrayf2[2];
		
		
		AdminUser tester1 = new AdminUser(admin_name, admin_pw, admin_email);
		NormalUser tester2 = new NormalUser(normalID, normal_name, normal_pw); 
		
		System.out.println("Enter Username: ");
		String username = input.next(); 
		
		System.out.println("Enter Password: "); 
		String password = input.next(); 
		
		if(username.equals(admin_name) && password.equals(admin_pw)) {
			
			int choice;
			do {
				tester1.displayMenu();
				choice = input.nextInt(); 
				switch(choice) {
				
				case 1:
					System.out.println("Enter ID: "); 
					int id = input.nextInt();
					
					input.nextLine();
					
					System.out.println("Enter First Name: ");
					String fn = input.nextLine(); 
					
					System.out.println("Enter Last Name: ");
					String ln = input.nextLine(); 
					
					System.out.println("Enter Email: ");
					String email = input.nextLine(); 
					
					System.out.println("Enter Zip code: ");
					int zip = input.nextInt();
					
					input.nextLine();
					
					System.out.println("Enter Phone Number: ");
					String pn = input.nextLine();
					
					PhoneBookEntry entry1 = new PhoneBookEntry(id, fn, ln, email, zip, pn); 
					tester1.addEntry(entry1); 
					
					break;
				
				case 2: 
					input.nextLine();
					System.out.println("Enter First Name: ");
					String fnToEdit = input.nextLine();
					
					System.out.println("Enter Last Name: ");
					String lnToEdit = input.nextLine();
					
					int editResult = tester1.edit(fnToEdit, lnToEdit);
					
					if(editResult == 1) {
						System.out.println("Successful Edit"); 
						
					}else {
						System.out.println("That name not found"); 
					}
					
					break;
					
				case 3: 
					input.nextLine();
					System.out.println("Enter First Name: ");
					String fnToDelete = input.nextLine();
					
					System.out.println("Enter Last Name: ");
					String lnToDelete = input.nextLine();
					
					int deleteResult = tester1.deleteEntry(fnToDelete, lnToDelete);
					
					if(deleteResult == 1) {
						System.out.println("Successfully Deleted"); 
					}else {
						System.out.println("Not Found Cannot Delete");
					}
				
					break;
					
				case 4: 
					tester1.sortDirectory();
					System.out.println("Sorted!");
					break;
					
				case 5:
					input.nextLine();
					System.out.println("Enter Phone Number to search for: ");
					String phoneNum = input.nextLine();
					
					int result = tester1.LinearSearchByPhoneNumber(phoneNum);
					
					if (result == 1) {
						System.out.println("Found!"); 
					}else {
						System.out.println("Phone Number Not Found!");
					}
					break;
				
				case 6: 
					System.out.println("Enter ID to search for: "); 
					int idBSearch = input.nextInt();
					PhoneBookEntry resultB = tester1.SearchbyIdBinarySearch(idBSearch);
					resultB.printBookEntry();
					
					break;
					
				case 7: 
					tester1.printInfo();
					
					break;
					
				case 8: 
					input.nextLine();
					System.out.println("Enter New Username: ");
					String newUN = input.next(); 
					tester1.setUsername(newUN);
					break;
					
				case 9: 
					input.nextLine();
					System.out.println("Enter New Password: ");
					String newPW = input.next(); 
					tester1.setPassword(newPW);
					
					break; 
					
				case 10: 
					System.exit(0);
					break;
					
			}
			
		}while(choice != 10);
	
	}else {
		if(username.equals(normal_name) && password.equals(normal_pw)) {
			int choice2;
			
			do {
				tester2.displayMenu();
				choice2 = input.nextInt(); 
				switch(choice2) {
				
				case 1:
					System.out.println("Enter ID: "); 
					int id = input.nextInt();
					
					input.nextLine();
					
					System.out.println("Enter First Name: ");
					String fn = input.next(); 
					
					System.out.println("Enter Last Name: ");
					String ln = input.next(); 
					
					System.out.println("Enter Email: ");
					String email = input.next(); 
					
					System.out.println("Enter Zip code: ");
					int zip = input.nextInt();
					
					input.nextLine();
					
					System.out.println("Enter Phone Number: ");
					String pn = input.nextLine();
					
					PhoneBookEntry entry1 = new PhoneBookEntry(id, fn, ln, email, zip, pn); 
					tester2.addEntry(entry1); 
					
					break;
				
				case 2: 
					input.nextLine();
					System.out.println("Enter First Name: ");
					String fnToEdit = input.next();
					
					System.out.println("Enter Last Name: ");
					String lnToEdit = input.next();
					
					int editResult = tester2.edit(fnToEdit, lnToEdit);
					
					if(editResult == 1) {
						System.out.println("Successful Edit"); 
						
					}else {
						System.out.println("That name not found"); 
					}
					
					break;
					
				case 3: 
					
					tester2.sortDirectory();
					System.out.println("Sorted!");
					break;
					
				case 4: 
					input.nextLine();
					System.out.println("Enter Phone Number to search for: ");
					String phoneNum = input.nextLine();
					
					int result = tester2.LinearSearchByPhoneNumber(phoneNum);
					
					if (result == 1) {
						System.out.println("Found!"); 
					}else {
						System.out.println("Phone Number Not Found!");
					}
					break;
					
				case 5:
					tester2.printInfo();
					break; 
					
				case 6:
					System.exit(0);
				
				}
				
			}while(choice2 != 6); 

		}
		
		input.close();
		first.close();
		second.close();
		
	}

}
}
		
		
		
		
		
		

