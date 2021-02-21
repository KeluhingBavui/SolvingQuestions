package ProjectEuler;

//Question 5 (Smallest Multiple)
/*2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
  What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
*/

public class Problem5 {
  public static void main(String[] args) {
    int target=20;
    while(true) {
      int count=0;
      for (int i = 1; i <= 20; i++) {
        if(target%i==0) count++;
      }
      if(count==20) break;
      target++;
    }
    System.out.println(target);
  }
}
