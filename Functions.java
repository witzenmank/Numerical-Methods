public class Functions
{
    /***
     *
     * @param array = array of x values to be passed
     * @return the result of f(xn) array
     */
    public static double[] f1(double[] array)
    {
        for (int i = 0; i < array.length; i++)
            array[i] = 1.0-(Math.sin(1.0-array[i]));
        return array;
    }
    /***
     *
     * @param array = array of x values to be passed
     * @return the result of f(xn) array
     */
    public static double[] f2(double[] array)
    {
        for (int i = 0; i < array.length; i++)
            array[i] = Math.sqrt(array[i] +1) +1;
        return array;
    }
    /***
     *
     * @param array = array of x values to be passed
     * @return the result of f(xn) array
     */
    public static double[] f3(double[] array)
    {
        for (int i = 0; i < array.length; i++)
            array[i] = Math.tanh(array[i] +1);
        return array;

    }
}
