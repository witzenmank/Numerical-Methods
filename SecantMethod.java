/*
    a. PROGRAMMER: Kenneth Witzenman
    b. COURSE:    CSCI 3321.01
    c. DATE:   March 1st, 2021
    d. ASSIGNMENT:  Number 2 - Secant Method
    e. ENVIRONMENT: Windows 10 Home - Build 19041.804
    f. FILES INCLUDED: Source file - SecantMethod.java // Output.txt file // Conclusions included in Output.txt
    g. PURPOSE:  To implement Secant Method to find 0 of a function
    h. INPUT:  Initial x1 and x2 values of 1.3 and 2.4
    i. PRECONDITIONS:    Up to date JVM on computer running code
    j. OUTPUT:  Output data is indicated in output.txt
    k. POSTCONDITIONS: The code
    l. ALGORITHM:  The main algorithm is located in the while loop of the main method. It takes x1 and x2,
                   as parameters for the Secant Method, then uses the result and x1 as the new parameters
                   until it reaches over 20 iterations, or f(x) becomes very precisely close to 0.
                   The sole function defined in the class is just f(x) defined using the Math standard
                   library. This was declared private, but could be made package public so f(x) can be
                   changed in implementation.
                   
    m.  ERRORS:  N/A
    n.  EXAMPLE: N/A
    o.  HISTORY: N/A
*/


public class SecantMethod
{
    public static void main (String[] args)
    {
        double x1 = 2.4;
        double x2 = 1.3;
        int i = 1;
        SecantMethod calc = new SecantMethod();

        while( i < 20 && Math.abs(calc.function(x1)) > Math.pow(10, -15))
        {
            double apx = x1 - ((calc.function(x1)*(x1-x2))/(calc.function(x1)- calc.function(x2)));
            double x1Value = calc.function(x1);
            System.out.println("Iteration number " + i + " // " + "Approximate value of x: " + x1 + " // Value of f(x): " + x1Value);
            x2 = x1;
            x1 = apx;
            i++;
        }
    }
    //function method is used to pass f(x) without having to type it out too many times
    private double function(double a)
    {
        return Math.sin(2*a) + Math.exp(a);
    }
}
