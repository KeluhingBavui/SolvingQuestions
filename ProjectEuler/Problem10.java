package ProjectEuler;

//Question 10 (Summation of Primes)
/*The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
  Find the sum of all the primes below two million.
*/

public class Problem10 {
  public static void main(String[] args) {
    long primesum=2;
    for (int i = 3; i < 2000000; i++) if(isPrime(i)) primesum+=i;
    System.out.println(primesum);
  }

  public static boolean isPrime(int num) {
    int i = 2;
    boolean check = false;
    while (i <= Math.sqrt(num)) {
      // condition for nonprime number
      if (num % i == 0) {
        check = true;
        break;
      }
      i++;
    }
    boolean result = !check ? true : false;
    return result;
  }
}
