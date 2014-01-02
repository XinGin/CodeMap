package com.xin.git.code.lc;

/**
 * @author XinGin
 * 
 * LeetCode Test Lab
 *
 */

public class TestLab {

	public static void main(String[] args) {

		//1.Test for TwoSum
		TwoSum twoSum = new TwoSum();
		int[] numbers = new int[3];
		for(int i = 0; i < 3; i++)
			numbers[i] = 3-i;
		int[] res = new int[2];
		res = twoSum.twoSum(numbers, 4);
		System.out.println("Index1:"+res[0]+","+"Index2:"+res[1]);
		//2.SingleNumber
		SingleNumber singleNumber = new SingleNumber();
		int[] numbers2 = {1,1,2,3,4,5,4,3,2};
		int res2 = singleNumber.singleNumber(numbers2);
		System.out.println(res2);
		//3.MultiplyStrings
		MultiplyStrings mS = new MultiplyStrings();
		String num1 = "111111";
		String num2 = "111111";
		System.out.println(mS.multiply(num1, num2));
		//4.PalindromeNumber
		PalindromeNumber pN = new PalindromeNumber();
		System.out.println(pN.isPalindrome(1011));

	}

}
