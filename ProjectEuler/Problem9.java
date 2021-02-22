package ProjectEuler;

//Question 9 (Pythagorean Triplet)
/*A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
  a^2 + b^2 = c^2
  For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.
  There exists exactly one Pythagorean triplet for which a + b + c = 1000.
  Find the product abc.
*/

public class Problem9 {
  public static void main(String[] args) {
    int target = 0;
    for(int a=0;a<1000;a++) { //Hard on for loop :)
      for(int b=0;b<1000;b++) {
        for(int c=0;c<1000;c++) {
          if(isPythagoreanTriplet(a, b, c)) {
            target=a+b+c;
            if(target==1000) System.out.println(a*b*c);
          }
        }
      }
    }
  }

  //Method to check whether the combination of numbers is a pythagorean triplet
  public static boolean isPythagoreanTriplet(int a, int b, int c) {
    if(a<b&&b<c) {
      int test = (a*a)+(b*b);
      if(Math.sqrt((double)test)==c) {
        return true;
      }else {
        return false;
      }
    }else {
      return false;
    }
  }
}
