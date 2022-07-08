package com.thamanna.LMS;
import java.util.Scanner;



//Creating the Menu for Library Management System
public class LmsMenu {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
	//	LibraryMethodsImplementation  impl=new LibraryMethodsImplementation ();
	
	
		do {
		System.out.println("************Library Management System************");
		System.out.println("1.Add Book\n"+
		                    "2.Add User\n"+
			                "3.View Book List\n"+
		                    "4.Veiw Book by BookCode\n"+
			                "5.Delete Book by BookCode\n"+
		                    "6.Check Book Availaibility\n"+
			                "7.Mark as Issued\n"+
		                    "8.Mark as Returned\n"+
			                "9.Generate Book Report\n"+
		                    "10.Exit\n");
	
		System.out.println("Enter you choice :");
		int ch=scan.nextInt();
			switch(ch) {
			case 1:
				String Bookname;
				   int Bookcode;
			     String Author;
			     String Subject;
			     String IssuedStatus;
			     String IssuedTo;
			     String  IssuedDate;
			     String ReturnDate;
			     System.out.println("Enter Book Name");
				    
			     Bookname=scan.nextLine();
			     scan.nextLine();
			     System.out.println("Enter Bookcode");
			     Bookcode=scan.nextInt();
			     scan.nextLine();
			     System.out.println("Enter Author");
			     Author=scan.nextLine();
			     System.out.println("Enter Subject");
			     Subject=scan.nextLine();
			     System.out.println("Enter IssuedStatus");
			     IssuedStatus=scan.nextLine();
			     System.out.println("Enter IssuedTo");
			     IssuedTo=scan.nextLine();
			     System.out.println("Enter IssuedDate");
			     IssuedDate=scan.nextLine();
			     System.out.println("Enter ReturnedDate");
			     ReturnDate=scan.nextLine();
			     System.out.println("Book Added Successfully");
			     
				
				//impl.addBook();
				
				break;
				
			case 2:
				String Name;
		    	int UserId;
		    	int IssuedBookId;
		    	String DateIssued;
		       
		     
		     System.out.println("Enter Name");
		     Name=scan.nextLine();
		     scan.nextLine();
		     System.out.println("Enter UserId");
		     UserId=scan.nextInt();
		     scan.nextLine();
		     System.out.println("Enter IssuedBookId");
		     IssuedBookId=scan.nextInt();
		     scan.nextLine();
		     System.out.println("Enter DateIssued");
		     DateIssued=scan.nextLine();
		     scan.nextInt();
		     System.out.println("User added successfully");
		     
				//impl.addUser();
				break;
			case 3:
			//	impl.veiwBookslist();
				break;
				
			case 4:
				//impl.veiwByBookCode();
				break;
			case 5:
			//	impl.DeleteBookByBookCode();
				break;
				
			case 6:
			//	impl.CheckBookAvailability();
				break;
			case 7:
			//	impl.MarkAsIssued();
				 break;
			case 8:
			//	impl.MarkAsReturned();
	              break;
			case 9:
				impl.generateBookReport();
				 break;
			case 10:
				System.out.println("Thank you for Using Application !!");
				System.exit(0);
			   break;
			
				
				default:
					System.out.println("please enter the valid choice !");
			}
		}
		while(true);
}
}



