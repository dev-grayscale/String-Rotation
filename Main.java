/**
 * Assume you have a method isRotation which checks if one word is a rotation
 * of another. Given two strings, s1 and s2, write code to check if s2 is a rotation of s1 using only one
 * call to isRotation (e.g., "waterbottle" is a rotation of "erbottlewat").
 */
public class Main {

  /**
   * Since by "rotating" it's meant cutting a segment of the original word and putting it at the end, it's being split in two parts:
   * x and y. By putting the cut part (x) to the end it becomes <i>yx</i>. By concatenating the rotated keyword with itself it must result
   * in a sequence of characters containing the original word because yx+yx gives y<b>xy</b>x
   *
   * Time Complexity: O(n)
   * Space Complexity: O(n)
   */
  public static boolean isRotationV1(String s1, String s2) {
    if (s1 == null || s2 == null || s1.isBlank() || s2.isBlank() || s1.length() != s2.length()) {
      return false;
    }

    return (s2 + s2).contains(s1);
  }
}
