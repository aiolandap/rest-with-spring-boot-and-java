package com.aleiolandap;

public class validacaoNumerica {
	validacaoNumerica(){
		
	}
	public boolean isNumeric(String number) {
		//String n;
		if(number == null) {
			return false;
		}else {
			number = number.replace(",", ".");
			return number.matches("[-+]?[0-9]*\\.?[0-9]+");
		}
		
	}
	
	public Double convertToDouble(String number) {
		if(number == null) {
			return 0D;
		}if(isNumeric(number)) {
			number = number.replace(",", ".");
			return Double.parseDouble(number);
		}
		return null;
	}
}
