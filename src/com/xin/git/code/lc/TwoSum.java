package com.xin.git.code.lc;

import java.util.*;

public class TwoSum {
    
	public int[] twoSum(int[] numbers, int target) {

			//1. 
	        Map<Integer, Integer> numIndex = new HashMap<Integer, Integer>();
	        int[] res = new int[2];
	        for(int i = 0; i < numbers.length; i++){
	        	if(numIndex.containsKey(target-numbers[i]))
	        		return new int[]{numIndex.get(target - numbers[i])+1,  i+1};
	        	numIndex.put(numbers[i], i);
	        }
	        
	        return res;
/*	
			//2.
	        int[] res = new int[2];
	        for(int i = 0; i < numbers.length; i++)
	            for(int j = i+1; j < numbers.length; j++)
	            	if( numbers[i]+numbers[j] == target){
	            		res[0] = i+1;
	            		res[1] = j+1;
	            		break;
	            	}
	
	        return res;
*/
	}

}