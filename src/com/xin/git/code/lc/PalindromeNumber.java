package com.xin.git.code.lc;

public class PalindromeNumber {
	public boolean isPalindrome(int x){
		
		if(x < 0)
			return false;
		if(x < 10)
			return true;
		
		int div = 10;
		
		while((x / div) >= 10){
			div *= 10;
		}
		
		int left = 0;
		int right = 0;
		while(div >= 10){
			left = x / div;
			right = x % 10;
			if(left != right)
				return false;
			x = (x % div) / 10;
			div /= 100;
		}
				
		return true;
	}
}
