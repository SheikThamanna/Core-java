package com.thamanna.LMS;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.io.BufferedReader;
import java.io.FileReader;
class Books implements Serializable{
	
	
	
	private int Bookcode;
	
	private String Author;
    private String Subject;
    private String IssuedStatus;
    private String IssuedTo;
    private String  IssuedDate;
    private String ReturnDate;
    
   
    public Books(){
    	
    }
	
    public Books( int Bookcode, String Author, String Subject,String IssuedTo,String  IssuedDate ,String ReturnDate
    		,String IssuedStatus){
	

	this.Bookcode=Bookcode;
	this.Author=Author;
	this.Subject=Subject;
	this.IssuedStatus=IssuedStatus;
	this.IssuedTo=IssuedTo;
	this.IssuedDate=IssuedDate;
	this.ReturnDate=ReturnDate;
	
}


  public void setBookcode(int Bookcode){
	this.Bookcode=Bookcode;
}

 public  int  getBookcode(int Bookcode){
    	 return Bookcode;
     }
 


 public void setAuthor(String Author){
	this.Author=Author;
}

public  String  getAuthor(String Author){
   	 return Author;
    }

public void setSubject(String Subject){
	this.Subject=Subject;
}
public  String  getBookcode(String Subject){
  	 return Subject;
  	 
  	
   }

public void setIssuedTo(String IssuedTo){
	this.IssuedTo=IssuedTo;
}
public  String  getIssuedTo(String IssuedTo){
  	 return IssuedTo;
   }

public void setIssuedDate(String  IssuedDate){
	this.IssuedDate= IssuedDate;
}
public  String  getIssuedDate(String  IssuedDate){
  	 return IssuedDate;
   }

public void setReturnDate(String ReturnDate){
	this.ReturnDate=ReturnDate;
}
public  String  getReturnDate(String ReturnDate){
  	 return ReturnDate;
   }



public void setIssuedStatus(String IssuedStatus){
	this.IssuedStatus=IssuedStatus;
}

 public  String getIssuedStatus (String setIssuedStatus){
    	 return setIssuedStatus;
     }
 

//override the method of class object
public String toString(){
	return "[Bookcode = "+ Bookcode +", Author ="+ Author +", Subject =" + Subject + ",IssuedTo ="
+ IssuedTo +", IssuedDate =" +IssuedDate +",ReturnDate =" +ReturnDate +"]";
}
}






