package com.dam2.calculator.ops;

import com.dam2.calculator.utils.ParserUtils;

public class OpDivision {
    public static String run(String input) {
        int[] nums = ParserUtils.parseInts(input);
        if (nums == null) return "Error: formato inválido";
        if (nums.length != 2) return "Error: sub necesita exactamente 2 números";

        return String.valueOf(nums[0] / nums[1]);
    }

}