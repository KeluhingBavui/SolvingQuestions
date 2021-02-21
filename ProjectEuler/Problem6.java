package ProjectEuler;

//Question 6 (Sum Square Difference)
/*
  Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
*/

public class Problem6 {
  public static void main(String[] args) {
    int sum = 0,squaresum = 0;
    for (int i = 1; i <= 100; i++) {
      sum+=i*i;
      squaresum+=i;
    }
    squaresum=squaresum*squaresum;
    System.out.println(squaresum-sum);
  }
}
