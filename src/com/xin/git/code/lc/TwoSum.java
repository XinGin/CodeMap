package com.xin.git.code.lc;

import java.util.*;

public class TwoSum {
    
	public int[] twoSum(int[] numbers, int target) {

		//One
		Map<Integer, Integer> numIndex = new HashMap<Integer, Integer>();
		for(int i = 0, len = numbers.length; i < len; i++){
			if(numIndex.containsKey(target-numbers[i]))
				return new int[]{numIndex.get(target - numbers[i])+1,  i+1};
			numIndex.put(numbers[i], i);
		}
	        
		return null;
/*	
		//Two
		int[] res = new int[2];
		for(int i = 0, len = numbers.length; i < len; i++)
    		for(int j = i+1; j < len; j++)
				if( numbers[i]+numbers[j] == target){
					res[0] = i+1;
					res[1] = j+1;
					break;
				}

		return res;
*/
	}

}