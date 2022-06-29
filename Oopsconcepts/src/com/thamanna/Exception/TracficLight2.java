package com.thamanna.Exception;

public enum TracficLight2  {
      RED(40),AMBER(5),GREEN(65); //if more than one variable is thier we have to use ; and this list always should be the first
	
      private int duration;
      TracficLight2(int duration){
    	  this.duration=duration;
      }
      public int getDuration(){
    	  return duration;
      }
      }
