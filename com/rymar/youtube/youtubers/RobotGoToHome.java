package youtubers;

///
///  we get m*n grid
/// in left bottom we have robot - in right top we have house
/// find how many solutions we can find
///  --------------------
///  |     |       |  🏡| 2   3
///  | ---------------- |
///  | 🤖  |       |    |   1 1
///  --------------------
/// GO ONLY left and right
///
///
///
public class RobotGoToHome {
  public static void main(String[] args) {
    int n = 2, m = 3;
    int v = path(n, m);
    System.out.println(v);
  }

  public static int path(int n, int m) {
      if (m == 1 && n == 1){
          return 1;
      }
      if (m < 1 || n < 1){
          return 0;
      }
  return path(n - 1,m)+path(n,m - 1);
  }

}
