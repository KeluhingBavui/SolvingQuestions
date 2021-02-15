package ProjectEuler;

//Problem 1(Multiples of 3 and 5)
/*If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
Find the sum of all the multiples of 3 or 5 below 1000.
 */

public class Problem1 {
    public static void main(String[] args) {
        //Count for multiples of 3
        int sum=0,mul=0,i=0;
        while(mul<1000) {
            mul=3*i;
            if (mul<1000) {
                sum+=mul;
            }
            i++;
        }
        //Reset & Count for multiples of 5
        mul=0;
        i=0;
        while(mul<1000) {
            mul=5*i;
            if (mul<1000) {
                if (i%3!=0) {   //Eliminate common multiples of 3 AND 5
                    sum+=mul;
                }
            }
            i++;
        }
        System.out.println(sum);
    }
}
