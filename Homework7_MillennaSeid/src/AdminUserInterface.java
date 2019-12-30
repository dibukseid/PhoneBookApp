public interface AdminUserInterface{
	public int addEntry(PhoneBookEntry e); 
	public int edit(String fn, String ln); 
	public void sortDirectory();
	//public int deleteEntry(int id);
	public int deleteEntry(String fn, String ln);
	public int LinearSearchByPhoneNumber(String PhoneNumber);  
	public PhoneBookEntry SearchbyIdBinarySearch(int id); 
	public void setUsername(String un);
	public void setPassword(String pw); 
	public void printInfo(); 
	
}