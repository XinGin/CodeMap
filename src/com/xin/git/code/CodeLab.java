/**
 * CodeLab.java
 * @author XinGin
 * 
 */

package com.xin.git.code;

import java.util.BitSet;
import java.math.*;


public class CodeLab {

	public static final int NUM_1 = 1;
	
	public static void main(String[] args) {

		BitSet oneBitmap = new BitSet();
		
		oneBitmap.set(10000,true);
		
		System.out.println(oneBitmap.get(10000));
		System.out.println(-9>>3);
		System.out.println(Math.sqrt(9));
	}

}
