package ProjectEuler;

//Question 14 (Longest Collatz Sequence)
/*The following iterative sequence is defined for the set of positive integers:

n → n/2 (n is even)
n → 3n + 1 (n is odd)

Using the rule above and starting with 13, we generate the following sequence:

13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1
It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms. Although it has not been proved yet (Collatz Problem), it is thought that all starting numbers finish at 1.

Which starting number, under one million, produces the longest chain?

NOTE: Once the chain starts the terms are allowed to go above one million.
*/

public class Problem14 {
  static long terms=0,termvalue;
  public static void main(String[] args) {
    long max=0;
    int count=1;
    for(long n=2;n<=1000000;n++) {
      System.out.print("n = " + n);
      chooser(n,count);
      System.out.println();
      if(terms>max) {
        max=terms;
        termvalue=n;
      }
    }
    System.out.println("The highest term is " + max + " with the starting number of " + termvalue);
  }

  public static void even(long n,int count) {
    n = n/2;
    count++;
    if(n>0) chooser(n,count);
  }

  public static void odd(long n,int count) {
    n = 3*n + 1;
    count++;
    if(n>0) chooser(n,count);
  }

  public static void chooser(long n,int count) {
    if(n%2==0) {
      if(n==1) {
        terms=count;
      }else {
        even(n,count);
      }
    }else {
      if(n==1) {
        terms=count;
      }else {
        odd(n,count);
      }
    }
  }
}
//I'm not sure how to find a way to optimise the code, the code may take a minute to run to get to a million.
