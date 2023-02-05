public class Approximation 
{ 
    public static void main(String args[]) 
    { 
        double h = 1.0; 
        double x = 1.0; 
        double error = 2 + 3 * Math.cos(1); 
        System.out.println("Errors in calculations");  
 
 
        while (h > Math.pow(2, -12)) 
        { 
            double approximation = ((Math.sin(Math.pow(x + h, 3)) + Math.pow(x + h, 2)) - (Math.sin(Math.pow(x, 3)) + Math.pow(x, 2))) /h; 
 
 
            System.out.println("Value of h is: " + h); 
            System.out.println("Value of approximation is: " + approximation); 
            System.out.println("Value of error is " + error); 
 
            h = h/2; 
 
 
 
 
        } 
 
 
 
 
        //  Print out the values of h, your approximation to f'(x), and the error in the approximation for each value of h used. 
        // This error will include the effects of both truncation and rounding 
    } 
} 
