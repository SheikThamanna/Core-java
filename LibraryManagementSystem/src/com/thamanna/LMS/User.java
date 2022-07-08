package com.thamanna.LMS;

import java.io.Serializable;

class Users implements Serializable{
	private	String Name;
    private	int UserId;
    private	int IssuedBookId;
    private	String DateIssued;
    private String ReturnDate;
    
    
    public Users(){
    	
    }
    
   
    public Users(String name,int userId,int issuedBookId,String dateIssued,String returnDate ) {
    	Name=name;
    	UserId=userId;
    	IssuedBookId=issuedBookId;
    	DateIssued=dateIssued;
    	ReturnDate=returnDate;
    	
    }
    

public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getUserId() {
		return UserId;
	}

	public void setUserId(int userId) {
		UserId = userId;
	}

	public int getIssuedBookId() {
		return IssuedBookId;
	}

	public void setIssuedBookId(int issuedBookId) {
		IssuedBookId = issuedBookId;
	}

	public String getDateIssued() {
		return DateIssued;
	}

	public void setDateIssued(String dateIssued) {
		DateIssued = dateIssued;
	}

	public String getReturnDate() {
		return ReturnDate;
	}

	public void setReturnDate(String returnDate) {
		ReturnDate = returnDate;
	}


 public  String toString() {
	 return "[Name ="+ Name +",UserId ="+UserId+",IssuedBookId ="+IssuedBookId+",DateIssued ="+DateIssued+
			  ",ReturnDate ="+ReturnDate+"]";
 }

}



