package ProjectEuler;

//Question 7 (10001st Prime)
/*By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
  What is the 10 001st prime number?
*/

public class Problem7 {
  public static void main(String[] args) {
    int i=2,count=0;
    while(true) {
      if(isPrime(i)) count++;
      if(count==10001) break;
      i++;
    }
    System.out.println(i);
  }

  public static boolean isPrime(int num) {
    int i = 2;
    boolean check = false;
    while (i <= num / 2) {
      // condition for nonprime number
      if (num % i == 0) {
        check = true;
        break;
      }
      ++i;
    }
    if (!check) {
      return true;
    } else {
      return false;
    }
  }
}
