package com.xin.git.code.lc;

import java.util.ArrayList;
import java.util.Arrays;

public class _3Sum {

  public ArrayList<ArrayList<Integer>> threeSum(int num[]){ 
    ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
    if(num.length < 3) 
      return res;
    Arrays.sort(num);
    int Length = num.length; 
    
    for(int i = 0; i < (Length - 2) && num[i] <= 0; i++){
      if(i > 0 && num[i] == num[i-1])
        continue;                     //Skip duplicate numbers
      
      int start = i + 1;
      int end = Length - 1;           //Two cursors
      while(start < end){
        int temp = num[i] + num[start] + num[end];
        if(temp > 0){
          end--;
        }else if(temp < 0){
          start++;
        }else{
          ArrayList<Integer> resTemp = new ArrayList<Integer>(3); //Temp result store
          resTemp.add(num[i]);
          resTemp.add(num[start]);
          resTemp.add(num[end]);
          res.add(resTemp);
          do{
            start++;
          }while(start < end && num[start] == num[start - 1]);
          do{
            end--;
          }while(start < end && num[end] == num[end + 1]);
        }
      }
    }
    return res;
  }
}
