import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

class DojoTest {
  private final Dojo dojo = new Dojo();

  @Test
  void countingSort() {
    char[] initial = new char[]{'g', 'a', 'w', 'b', 'a', 'g', 'c'};
    char[] expected = new char[]{'a', 'a', 'b', 'c', 'g', 'g', 'w'};
    char[] actual = dojo.countingSort(initial);
    assertArrayEquals(expected, actual);
  }

  @Test
  void maximumSubArray() {
    int[] nums = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
    int expected = 6;
    int actual = dojo.maximumSubarray(nums);
    assertEquals(expected, actual);
  }

  @Test
  void binarySearch() {
    int[] nums = new int[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
    int searchNum = 67;
    assertTrue(dojo.binarySearch(nums, searchNum));
  }

  @Test
  void biggestNumber() {
    List<String> nums = new ArrayList<>();
    nums.add("54");
    nums.add("546");
    nums.add("548");
    nums.add("60");
    String expected = "6054854654";
    String actual = dojo.biggestNumber(nums);
    assertEquals(expected, actual);
  }

  @Test
  void insertionSort() {
    char[] initial = new char[]{'g', 'a', 'w', 'b', 'a', 'g', 'c'};
    char[] expected = new char[]{'a', 'a', 'b', 'c', 'g', 'g', 'w'};
    char[] actual = dojo.countingSort(initial);
    assertArrayEquals(expected, actual);
  }
}