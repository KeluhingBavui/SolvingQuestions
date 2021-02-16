package FinalExamQuestion;

//The Question!
//Write a Java program that lets the user to enter 3 numbers, each in between 1-9.
//Then, form the expressions using the operators (addition, subtraction, multiplication, and division).
//Given the order of the number is fix and the result of the expression must equal to 18. 
//You can only use array to solve the problem.

import java.util.*;

public class Equals18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 3 numbers [1-9] : ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();
        
        //sol is solution, out is print output
        int[] sol = new int[26];
        String[] out = new String[26];
        
        try {
        sol[0] = num1 + num2 + num3;
        out[0] = num1 + " + " + num2 + " + " + num3 + " = " + sol[0];
        
        sol[1] = num1 + num2 - num3;
        out[1] = num1 + " + " + num2 + " - " + num3 + " = " + sol[1];
        
        sol[2] = num1 + num2 * num3;
        out[2] = num1 + " + " + num2 + " * " + num3 + " = " + sol[2];
        
        sol[3] = (num1 + num2) * num3;
        out[3] = "(" + num1 + " + " + num2 + ") * " + num3 + " = " + sol[3];
        
        sol[4] = num1 + num2 / num3;
        out[4] = num1 + " + " + num2 + " / " + num3 + " = " + sol[4];
        
        sol[5] = (num1 + num2) / num3;
        out[5] = "(" + num1 + " + " + num2 + ") / " + num3 + " = " + sol[5];
        
        sol[6] = num1 - num2 - num3;
        out[6] = num1 + " - " + num2 + " - " + num3 + " = " + sol[6];
        
        sol[7] = num1 - num2 * num3;
        out[7] = num1 + " - " + num2 + " * " + num3 + " = " + sol[7];
        
        sol[8] = (num1 - num2) * num3;
        out[8] = "(" + num1 + " - " + num2 + ") * " + num3 + " = " + sol[8];
        
        sol[9] = num1 - num2 / num3;
        out[9] = num1 + " - " + num2 + " / " + num3 + " = " + sol[9];
        
        sol[10] = (num1 - num2) / num3;
        out[10] = "(" + num1 + " - " + num2 + ") / " + num3 + " = " + sol[10];
        
        sol[11] = num1 * num2 + num3;
        out[11] = num1 + " * " + num2 + " + " + num3 + " = " + sol[11];
        
        sol[12] = num1 * (num2 + num3);
        out[12] = num1 + " * (" + num2 + " + " + num3 + ") = " + sol[12];
        
        sol[13] = num1 * num2 - num3;
        out[13] = num1 + " * " + num2 + " - " + num3 + " = " + sol[13];
        
        sol[14] = num1 * (num2 - num3);
        out[14] = num1 + " * (" + num2 + " - " + num3 + ") = " + sol[14];
        
        sol[15] = num1 * num2 * num3;
        out[15] = num1 + " * " + num2 + " * " + num3 + " = " + sol[15];
        
        sol[16] = num1 * num2 / num3;
        out[16] = num1 + " * " + num2 + " / " + num3 + " = " + sol[16];
        
        sol[17] = num1 * (num2 / num3);
        out[17] = num1 + " * (" + num2 + " / " + num3 + ") = " + sol[17];
        
        sol[18] = num1 / num2 + num3;
        out[18] = num1 + " / " + num2 + " + " + num3 + " = " + sol[18];
        
        sol[19] = num1 / (num2 + num3);
        out[19] = num1 + " / (" + num2 + " + " + num3 + ") = " + sol[19];
        
        sol[20] = num1 / num2 - num3;
        out[20] = num1 + " / " + num2 + " - " + num3 + " = " + sol[20];
        
        sol[21] = num1 / (num2 - num3);
        out[21] = num1 + " / (" + num2 + " - " + num3 + ") = " + sol[21];
        
        sol[22] = num1 / num2 * num3;
        out[22] = num1 + " / " + num2 + " * " + num3 + " = " + sol[22];
        
        sol[23] = num1 / (num2 * num3);
        out[23] = num1 + " / (" + num2 + " * " + num3 + ") = " + sol[23];
        
        sol[24] = num1 / num2 / num3;
        out[24] = num1 + " / " + num2 + " / " + num3 + " = " + sol[24];
        
        sol[25] = (int)((double)num1 / ((double)num2 / (double)num3));
        out[25] = num1 + " / (" + num2 + " / " + num3 + ") = " + sol[25];
        } catch(ArithmeticException ex) {}
        
        //Loop through and find any solutions that == 18
        boolean hasSolution = false;
        for (int i = 0; i < sol.length; i++) {
            if (sol[i]==18) {
                hasSolution = true;
                System.out.println(out[i]);
            }
        }
        if (hasSolution==false) {
            System.out.println("No solution");
        }
        in.close();
    }
    
    /*This is so far a workable solution I can find that gave the same output to
      the output examples in the question. However I still think the code can be
      changed to a more optimized way but I am unable to come up with other ways.
      If there are any better solutions, feel free to share!
    */
}
