package com.thamanna.Exception;

public class Test {
	public static void main(String[] args) {
		try {
			distribute(1200,0);
		}catch(DenominatorZeroException e) {
			System.out.println(e);
		}
	}
	
	private static void distribute(int noOfchocolates , int noOfparticipants) {
		System.out.println(Calculator.divide(noOfchocolates, noOfparticipants));
	}

}

