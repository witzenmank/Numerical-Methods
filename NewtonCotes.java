import java.util.Arrays;

public class NewtonCotes {

    public static void Newton()
    {
        System.out.println("--------------------------------------------------------" +
                "-------------------------------------------------------------");
        System.out.println("Closed Newton Cotes Quadrature");

        double[] array1 = {-1, 0, 0, 0, 0};
        double[] array2 = {-1, 0, 0, 0, 0};
        double[] array3 = {-1, 0, 0, 0, 0};
        double[] weights = {7, 32, 12, 32, 7};

        /***
         * h used for xi = x0+ih for
         */
        double h= 2.0/4.0;

        /***
         * setting xi values using x0+ih
         * for 1st function array
         */
        for(int i = 0; i <array1.length; i++)
        {
            array1[i] = array1[0] + (i*h);
        }
        /***
         * setting xi values using x0+ih
         * for second function array
         */
        for(int i = 0; i <array2.length; i++)
        {
            array2[i] = array2[0] + (i*h);
        }
        /***
         * setting xi values using x0+ih
         * for third function array
         */
        for(int i = 0; i <array3.length; i++)
        {
            array3[i] = array3[0] + (i*h);
        }
        /***
         * Printing out weights and nodes
         */
        System.out.println("Weights and nodes for Newton-Cotes 5 Point will be the same for all" +
                " the formulas approximated at -1 to 1 so they are: ");
        System.out.println("Weights: " + Arrays.toString(weights));
        System.out.println("Nodes: " + Arrays.toString(array1));
        /***
         * now running the arrays through the 3 functions
         */
        Functions.f1(array1);
        Functions.f2(array2);
        Functions.f3(array3);
        /***
         * finally, running the arrays through the Boole's Rule
         */
        double function1Appx = Booles(array1);
        double function2Appx = Booles(array2);
        double function3Appx = Booles(array3);
        //fnTV means f1,2,3 True Value
        double f1TV = 0.58385316345285761300;
        double f2TV = 3.8856180831641267317;
        double f3TV = 1.3250027473578644309;

        /***
         * Printing results
         */
        System.out.println("Appx of f1: " + function1Appx + " True Value: " +
                f1TV + " Error: " + (f1TV - function1Appx));
        System.out.println("Appx of f2: " + function2Appx + " True Value: " +
                f2TV + " Error: " + (f2TV - function2Appx));
        System.out.println("Appx of f3: " + function3Appx + " True Value: " +
                f3TV + " Error: " + (f3TV - function3Appx));
        System.out.println("--------------------------------------------------------" +
                "-------------------------------------------------------------");
    }

    /***
     *
     * @param array = array already ran through the function that returns array of f0, f1, ...
     * Run these f0 ... fi functions through Boole's Rule
     * @return approximation
     */
    public static double Booles(double[] array)
    {
        double h= 2.0/5.0;
        double result = ((2.0/45.0)*h) * ((7* array[0]) + (32* array[1]) +
                (12* array[2])+ (32* array[3]) + (7* array[4]));

        return result;
    }

}
