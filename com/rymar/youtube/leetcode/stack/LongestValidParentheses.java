package leetcode.stack;

import java.util.Stack;

public class LongestValidParentheses {
  public static void main(String[] args) {
    longestValidParentheses("()");
  }

  public static int longestValidParentheses(String s) {
    var chars = s.toCharArray();
    Stack stack = new Stack<Character>();
    stack.push(-1);
    int max_len = 0;
    for (int i = 0; i < chars.length; i++) {
      if (s.charAt(i) == '(') {
        stack.push(i);
      } else {
        stack.pop();
        if (stack.isEmpty()) {
          stack.push(i);
        } else {
          max_len = Math.max(max_len, i - (int) stack.peek());
        }
      }
    }
    return max_len;
  }
}
