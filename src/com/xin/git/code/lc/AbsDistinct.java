package com.xin.git.code.lc;

//Codility AbsDistinct by XinGin

import java.util.*;

class AbsDistinct {
    public int absDistinct(int[] A) {
        
        Map<Long, Integer> davHash = new HashMap<Long, Integer>();
        
        for(int i=0; i < A.length; i++)
            if(!davHash.containsKey((long)Math.abs(A[i])))
                davHash.put((long)Math.abs(A[i]), null);
        return davHash.size();
              
    }
}