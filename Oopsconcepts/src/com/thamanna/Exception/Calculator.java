package com.thamanna.Exception;

public class Calculator {
public static int divide(int num ,int den)throws DenominatorZeroException {
	if( den==0) {
	throw new DenominatorZeroException("Denominator 0.");	
	}
	int res=num/den;
	return res;
			
}
}
