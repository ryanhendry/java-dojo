import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Dojo {

  //O(n + k) k == potential range of values
  public char[] countingSort(char[] input) {
    int[] charCount = new int[256]; //extended ascii
    for (char c: input) {
      charCount[(int) c]++;
    }
    for (int i = 1; i < charCount.length; i++) {
      charCount[i] = charCount[i-1] + charCount[i];
    }
    char[] result = new char[input.length];
    for (char c: input) {
      int index = charCount[(int) c] - 1;
      result[index] = c;
      charCount[(int) c]--;
    }
    return result;
  }

  //O(n)
  public int maximumSubarray(int[] nums) {
    int globalMax = Integer.MIN_VALUE;
    int localMax = 0;
    for(int num: nums) {
      localMax = Math.max(num, localMax + num);
      if (localMax > globalMax) {
        globalMax = localMax;
      }
    }
    return globalMax;
  }

  //O(log n)
  public boolean binarySearch(int[] nums, int searchNum) {
    int min = 0;
    int max = nums.length - 1;
    while (min <= max) {
      int guess = max + min / 2;
      if (nums[guess] < searchNum) {
        min = guess + 1;
      } else if (nums[guess] > searchNum) {
        max = guess - 1;
      } else {
        return true;
      }
    }
    return false;
  }

  public String biggestNumber(List<String> nums) {
    Collections.sort(nums, new Comparator<String>() {
      public int compare(String x, String y) {
        String xy = x + y;
        String yx = y + x;
        return xy.compareTo(yx) > 0 ? -1 : 1;
      }
    });
    StringBuilder sb = new StringBuilder();
    for (String num: nums) {
      sb.append(num);
    }
    return sb.toString();
  }

  public int[] insertionSort(int[] nums) {

  }
}
