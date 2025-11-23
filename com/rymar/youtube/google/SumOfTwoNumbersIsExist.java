package google;

import java.util.HashSet;
import java.util.Set;

/// link: https://www.youtube.com/watch?v=XKu_SEDAykw
/// we have collections of numbers
/// and sum target
/// we need to get boolean
///
/// I nearly had this task in an interview at one of the top 3 IT companies in Ukraine.
public class SumOfTwoNumbersIsExist {
  private static final int[] NUMS_ARRAY = {1, 2, 3, 4, 4};
  private static final int TARGET = 8;

  public static void main(String[] args) {
    var useDoubleLoopResult = useDoubleLoop(NUMS_ARRAY, TARGET);
    var useSetResult = useSet(NUMS_ARRAY, TARGET);

    System.out.println(useDoubleLoopResult);
    System.out.println(useSetResult);
  }

  // Brute force
  // O(n^2)
  public static boolean useDoubleLoop(int[] nums, int target) {
    for (int i = 0; i < nums.length; i++) {
      for (int j = i + 1; j < nums.length; j++) {
        if (nums[i] + nums[j] == target) {
          return true;
        }
      }
    }
    return false;
  }

  // good,but also we allocate additional memory for set
  // O(n)
  public static boolean useSet(int[] nums, int target) {
    Set set = new HashSet<>();
    int current = 0;
    for (int i = 0; i < nums.length; i++) {
      current = target - nums[i];
      if (set.contains(current)) {
        return true;
      };
      set.add(nums[i]);
    }
    return false;
  }
}
