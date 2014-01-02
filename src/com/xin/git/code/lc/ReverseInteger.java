package com.xin.git.code.lc;

public class ReverseInteger {
  public int reverse(int x){
    
    int sign = 1;
    if(x < 0){
      sign = -1;
      x *= -1;
    }
    
    long res = this.reverse((long)x);
    if((sign * res) > Integer.MAX_VALUE || (sign * res) < Integer.MIN_VALUE)
      throw new RuntimeException("Reversed Integer is out of bounds!");
    
    return (int)(sign * res);
  }
  
  private long reverse(long x){
    
    long res = 0;
    while(x != 0){
      res = (res * 10) + (x % 10);
      x /= 10;
    }
    
    return res;
  }
}

