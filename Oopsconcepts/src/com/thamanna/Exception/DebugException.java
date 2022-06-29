package com.thamanna.Exception;

public class DebugException {
	public static void main(String[] args) {
		check();
	}
	
	
	private static void check() {
		int num=1000;
		int []dens= {5,10,15,0,30};
		try {
			for(int den:dens) {
			int res=num/den;
			System.out.println(res);
		}
		}catch(ArithmeticException ex) {
			ex.printStackTrace();
		}
		
		
	}

}
