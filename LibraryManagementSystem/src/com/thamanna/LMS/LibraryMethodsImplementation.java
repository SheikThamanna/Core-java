package com.thamanna.LMS;
import java.io.*;
import java.util.*;
import java.io.FileWriter;

public abstract class LibraryMethodsImplementation implements Bookinterface  {
	static List<Books> list=new ArrayList<>();
	static List<Books> books=new ArrayList<>();
	static List<Users> users =new ArrayList<>();
	
	static File file1=new File("C:\\Users\\Sheik Thamanna\\eclipse-workspace\\LibraryManagementSystem\\src\\libraryBooks.txt");
	static File file2=new File("C:\\Users\\Sheik Thamanna\\eclipse-workspace\\LibraryManagementSystem\\src\\libraryUsers.txt");
	
	public LibraryMethodsImplementation() {
		
	}
   public static  void Bookfile() {
	   if(file1.length()!=0) {
		   try
		   {
			   FileInputStream bi=new FileInputStream(file1);
			   ObjectInputStream oi=new ObjectInputStream(bi);
			   books=(ArrayList<Books>)oi.readObject();
		   }catch(FileNotFoundException e) {
			   e.printStackTrace();
		   }catch(IOException e) {
			   e.printStackTrace();
		   }catch(ClassNotFoundException e) {
			   e.printStackTrace();
		   }
	   }
	   else {
		   System.out.println("file is empty");
	   }
   }
   public static void Bookupdate() {
	   try {
		   FileOutputStream bo=new FileOutputStream(file1);
		   ObjectOutputStream oo=new ObjectOutputStream(bo);
		   oo.writeObject(books);
		   oo.flush();
		   oo.close();
		   
	   } catch (Exception e) {
		   e.printStackTrace();
	   }
   }
	   public static  void Userfile() {
		   if(file2.length()!=0) {
			   try
			   {
				   FileInputStream ui=new FileInputStream(file2);
				   ObjectInputStream uo=new ObjectInputStream(ui);
				   users=(ArrayList<Users>)uo.readObject();
			   }catch(FileNotFoundException e) {
				   e.printStackTrace();
			   }catch(IOException e) {
				   e.printStackTrace();
			   }catch(ClassNotFoundException e) {
				   e.printStackTrace();
			   }
		   }
		   else {
			   System.out.println("file is empty");
		   }
	   }
	   public static void Userupdate() {
		   try {
			   FileOutputStream uo=new FileOutputStream(file2);
			   ObjectOutputStream ou=new ObjectOutputStream(uo);
			   ou.writeObject(users);
			   ou.flush();
			   ou.close();
			   
		   } catch (Exception e) {
			   e.printStackTrace();
		   }
	   }
public void addBook(String Bookcode,String Bookname,String Author,String Subject,String IssuedStatus,String IssuedTo, String IssuedDate, String ReturnDate) {
		   Bookfile();
		  
		   books.add(new Books(Bookcode , Bookname, Author, Subject, IssuedStatus,IssuedTo,IssuedDate,ReturnDate));
		   System.out.println(" Book added Successfully");
		   try
		   {
		
			   FileOutputStream bo=new FileOutputStream(file1);
			   ObjectOutputStream oo=new ObjectOutputStream(bo);
			   oo.writeObject(books);
			   oo.flush();
			   oo.close();
		   }catch (Exception e) {
			   e.printStackTrace();
		   }
	   }
	   
public void addUser(String name,int userId) {
			   Userfile();
			   users.add(new Users(name, userId));
			   System.out.println("User Added Successfully");
			   try {
				   
				   FileOutputStream uo=new FileOutputStream(file2);
				   ObjectOutputStream ou=new ObjectOutputStream(uo);
				   ou.writeObject(users);
				   ou.flush();
				   ou.close();
				   
			   } catch (Exception e) {
				   e.printStackTrace();
			   }
		   }
 public void veiwBookslist() {
			   Bookfile();
			   if(file1.length()!=0) {
				   try {
					   FileInputStream bi=new FileInputStream(file1);
					   ObjectInputStream oi=new ObjectInputStream(bi);
					   books=(ArrayList<Books>)oi.readObject();
					System.out.println("BookCode\t"+"BookName\t"+"Author\t"+"subject\t"+"IssuedDate\t");
					for(Books i:books) {
						System.out.println(i.getBookcode(null)+"  "+i.getName()+" "+ i.getAuthor(null)+
								" "+i.getSubject()+" "+i.getIssuedStatus());
					}
				   }catch(Exception e) {
					   e.printStackTrace();
				   }
				   
			   }else
				   System.out.println(" ");
	   }
public void veiwByBook(String Bookcode) {
			   Bookfile();
			   System.out.println("---------------------------------");
			   System.out.println("Book Details");
			   System.out.println("-------------------------------");
			   for( Books i:books) {
				   if(Bookcode.equals(i.getBookcode(Bookcode))) {
					   System.out.println("BookCod:"+i.getBookcode(null));
					   System.out.println("Bookname:"+i.getName(null));
					   System.out.println("Author:"+i.getAuthor(null));
					   System.out.println("Subject:"+i.getSubject(null));
					   System.out.println("IssuedDate:"+i.getIssuedDate(null));
					   
				   }
				   else
				   {
					   System.out.println(" ");
				   }
}

}
public void DeleteBookByBookCode(String Bookcode) {
			   Bookfile();
			   for(int i=0;i<books.size();i++) {
				   if(Bookcode.equals(books.get(i).getBookcode(Bookcode)))
						   {
					   list.remove(i);
					   break;
				   }
			   }
			   Bookupdate();
		   }
public void CheckBookAvailability(String Bookcode) {
			   boolean flag=false;
				System.out.println("\n-------------------------------------");
				System.out.format("bookcode","BookName","Author","Subject","Status");
				System.out.println("\n-------------------------------------");
				if(books.size()>0) {
					for(Books book:books) {
						if(book.getIssuedStatus()=="Available") {
							System.out.println(book.getBookcode(),book.getBookname(),book.getAuthor(),book.getSubject(),book.getIssuedStatus())
					        System.out.println();
							flag=true;
							
						}
					}
				}
				else {
					System.out.println("Book Available in the library");
				}
				System.out.println("\n---------------------------------");
				if(flag==false) {
					System.out.println("Do you want to check Another book");
				}
		   }
public void MarkAsIssued(String Bookcode,int userId) {
			   boolean flag=false;
				  for(Books book:books) {
					if(book.getBookCode().equals(bookcode) && book.getStatus().equals("Available")) {
						flag=true;
						System.out.println("   Book Borrowed Sucessfully");
						book.setStatus("Not Available");
						System.out.println("Borrowed book Details" + book);
						
					}
					
				}
				
				if(flag==false) {
					System.out.println("This book is not available");
				}
				
		   }
public void MarkAsReturned(String Bookcode) {
			   boolean flag=false;
			   for(Books book:books) {
					if(book.getBookcode().equals(bookcode)&& book.getStatus().equals("Not Available")) {
						flag=true;
						System.out.println("Book returned Successfully");
						book.setStatus("Available");
						System.out.println("Return book Details."+ book);
					}
				}
				if(flag==false) {
					System.out.println("we cannot return this book");
				}
		   }

public void generateBookReport() {
			   System.out.println("********choose report type*********\n"+
                       "1.Export All\n"+
			              "2.Export by availability\n"+
                         "3.Export by Issued\n"  );
			   Scanner a=new Scanner(System.in);
			   int ch=a.nextInt();
			   switch(ch) {
			   case 1:
			   case 2:
			   case 3:
				   default:
				   
			   }
			   File file=new File(".txt");
					   try {
						   file.createNewFile();
					   }
			   catch(Exception e) {
				   e.printStackTrace();
			   }
					   try {
						   FileWriter fw=new FileWriter(file);
						   PrintWriter pw=new PrintWriter(fw);
					   
					   if(file.length()==0) {
						   pw.println("BookCode\t"+"BookName\t"+"Author\t"+"subject\t"+"IssuedDate\t");
					   }
					   for(int i=0;i<list.size();i++) {
						   pw.println(list.get(i).toString());
					   }
					   pw.close();
					   list.clear();
			   
		   }
					   catch(Exception e) {
						   e.printStackTrace();
					   }
		   
}
@Override
public void addBook() {
	
}
@Override
public void addUser() {
	// TODO Auto-generated method stub
	
}
@Override
public void veiwByBookCode() {
	// TODO Auto-generated method stub
	
}
@Override
public void DeleteBookByBookCode() {
	// TODO Auto-generated method stub
	
}
@Override
public void CheckBookAvailability() {
	// TODO Auto-generated method stub
	
}
@Override
public void MarkAsIssued() {
	// TODO Auto-generated method stub
	
}
@Override
public void MarkAsReturned() {
	// TODO Auto-generated method stub
	
}
@Override
public void exit() {
	// TODO Auto-generated method stub
	
}
@Override
public void GenerateReport() {
	// TODO Auto-generated method stub
	
}
}
	   
 
