package leetcode.stack;

import java.util.Stack;

class UnixPath {
  public static void main(String[] args) {
    String path = "////../";
    simplifyPath(path);
  }

  public static String simplifyPath(String path) {
    Stack stack = new Stack<>();
    var folders = path.split("/");
    for (String folder : folders) {
      if (folder.equals(".") || folder.isEmpty()) continue;
      if (!folder.equals("..")) stack.push(folder);
      else if (!stack.isEmpty()) stack.pop();
    }
    return "/" + String.join("/", stack);
  }
}
