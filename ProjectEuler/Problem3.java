package ProjectEuler;

//Question 3 (Largest Prime Factor)
/* The prime factors of 13195 are 5, 7, 13 and 29.
  What is the largest prime factor of the number 600851475143 ?
*/

public class Problem3 {
  public static void main(String[] args) {
    int prime=0,i=1;
    double target = 600851475143.0;
    while (i<Math.sqrt(target)) {
      if (target%i==0) {
        int quotient = (int)target/i;
        if (isPrime(i)||isPrime(quotient)) prime=i;
      }
      i++;
    }
    System.out.println(prime);
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
