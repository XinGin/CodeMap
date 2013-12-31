package com.xin.git.code.lc;

public class MultiplyStrings {
	
	//return int number from assigned position of a string
	private int getInt(String s1, int idx1){
		return s1.charAt(idx1)-'0';
	}
	
	private char getChar(int num1){
		return (char)(num1 + '0');
	}
	
	public String multiply(String num1, String num2) {
		
		if(num1.equals("0") || num2.equals("0"))
			return "0";
		
		int len1 = num1.length();
		int len2 = num2.length();
		int[] product = new int[len1 + len2]; 
		
		for(int j = 0; j < len1; j++){
			int temp = 0;
			int intJ = this.getInt(num1, len1 - j - 1);
			for(int k = 0; k < len2; k++){
				int intK = this.getInt(num2, len2 - k - 1);
				temp += product[j + k] + intJ * intK;
				product[j + k] = temp % 10;
				temp /= 10;
			}
			if(temp != 0)
				product[j + len2] = temp; 			
		}
		
		//Output process
		int i = len1 + len2 -1;
		while(i > 0 && product[i] == 0)
			i--;
		StringBuffer sb = new StringBuffer();
		while(i >= 0){
			sb.append(this.getChar(product[i]));
			i--;
		}
		
		return sb.toString();
		
    }
		
}
