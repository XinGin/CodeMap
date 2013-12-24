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
		//END TwoSum
				
	}

}
