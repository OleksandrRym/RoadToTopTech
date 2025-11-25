package leetcode.stack;

import java.util.Stack;

/// 844. Backspace String Compare

public class BackspaceStringCompare {
  private static final char BACKSPACE = '#';

  public static void main(String[] args) {
    var s = "ab#c";
    var t = "ad#c";
    System.out.println(backspaceCompare(s, t));
  }

  public static boolean backspaceCompare(String s, String t) {
    Stack stkS = new Stack<>();
    Stack stkT = new Stack<>();
    char[] charsS = s.toCharArray();
    char[] charsT = t.toCharArray();
    for (char ch : charsS) {
      switch (ch) {
        case BACKSPACE -> {
          if (!stkS.isEmpty()) stkS.pop();
        }
        default -> stkS.push(ch);
      }
    }
    for (char ch : charsT) {
      switch (ch) {
        case BACKSPACE -> {
          if (!stkT.isEmpty()) stkT.pop();
        }
        default -> stkT.push(ch);
      }
    }
    return stkT.equals(stkS);
  }
}
