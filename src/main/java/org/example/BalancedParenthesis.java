package org.example;

import java.util.Stack;

public class BalancedParenthesis {
    public static boolean vaildParentheses(String strs){
        Stack<Character> stack = new Stack<>();
        for(char c: strs.toCharArray()){
            if(c=='(' ) stack.push(')');
            else if (c=='{') stack.push('}');
            else if (c=='[') stack.push(']');
            else if (stack.isEmpty() || stack.pop()!=c) return false;
        }
        return true;
    }
}
