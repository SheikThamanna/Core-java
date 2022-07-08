package com.thamanna.LMS;

public interface Bookinterface {
	public void addBook(String Bookcode,String Bookname,String Author,String Subject,String IssuedStatus);
	public void addUser(String name,int userId);
	public void veiwBookslist();
	public void veiwByBookCode(String Bookcode);
	public void DeleteBookByBookCode(String Bookcode);
	public void CheckBookAvailability(String Bookcode); 
	public void MarkAsIssued(String Bookcode,int userId);
	public void MarkAsReturned(String Bookcode);
	public void generateBookReport();
	public void exit();
	
	void GenerateReport();
	

}
