package com.dam2.calculator.ops;

import com.dam2.calculator.utils.ParserUtils;

public class OpMax {
	
    public static String run(String input) {
    	int[] nums = ParserUtils.parseInts(input);
        if (nums == null) return "Error: formato inválido";
        if (nums.length < 2) return "Error: mete al menos 2 números";
        int res = 0;
        for (int num : nums) {
        	res+=num;
        }
        
        return String.valueOf(res);
    }

}