package ProjectEuler;

//Question 4 (Largest Palindrome Product)
/* A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers 
   is 9009 = 91 × 99.
   Find the largest palindrome made from the product of two 3-digit numbers.
*/

public class Problem4 {
  public static void main(String[] args) {
    int goal=0;
    for (int i = 100; i < 1000; i++) {
      for (int j = 100; j < 1000; j++) {
        int x = i*j;
        String s = Integer.toString(x);
        String rev = reverse(s);
        if(s.equals(rev)) {
          goal = Math.max(goal,x);
        }
      }
    }
    System.out.println(goal);
  }

  //Method to reverse string
  public static String reverse(String s) {
    char[] arr = s.toCharArray();
    for (int i = 0,j=arr.length-1; i < arr.length/2; i++,j--) {
      char t = arr[i];
      arr[i] = arr[j];
      arr[j] = t;
    }
    return new String(arr);
  }
}
