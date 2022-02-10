
//https://leetcode.com/problems/basic-calculator/

import java.util.*;

public class Solution {
    
    public int calculate(String s) {
        
        char sign = '+';
        int num = 0, sum = 0; 
        Stack<Integer> operands = new Stack<>(); 
        
        for (int i = 0; i < s.length(); i++) {
            
            char c = s.charAt(i); 
            if (Character.isDigit(c)) {
                num = c - '0';
                while (i + 1 < s.length() && Character.isDigit(s.charAt(i+1))) {
                    num *= 10;
                    num += (s.charAt(++i) - '0');
                }
                sum = sign == '-' ? sum - num : sum + num;
            } else if (c == '+' || c == '-') {
                sign = c;
            } else if (c == '(') {
                operands.push(sum);
                operands.push(Integer.valueOf(sign)); 
                sum = 0; 
                sign = '+';
            } else if (c == ')') {
                if (operands.size() > 1) {
                    sign = operands.pop() == 45 ? '-' : '+';
                }
                num = (operands.pop());
                sum = sign == '+' ? num + sum : num - sum; 
            }
        }
        return sum; 
    }
}