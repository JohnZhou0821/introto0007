public class SalesData 
{
    private double[] sales; //sales data
    
    public SalesData(double[] s)
    {
        //create an array as large as s.
        sales= new double[s.length];
        //copy elements from s to sales
        for (int index=0; index<s.length; index++)
            sales[index]=s[index];
    }
    ///get total method
    public double getTotal()
    {
        double total=0.0; //accumulator
        //accumulate the sum of elements in sales array
        for (int index=0; index<sales.length;index++)
            total += sales[index];

            //return total.
            return total;
    }
    //get average methods
    public double getAverage()
    {
    return getTotal()/sales.length;
    }
    //get highest
    public double getHighest()
    {
        double highest=sales[0];
        for (int index=1; index<sales.length; index++)
        {
            if (sales[index]>highest)
                highest=sales[index];
        }
        return highest;
    }
    //get lowest
    public double getLowest()
    {
        double lowest =sales[0];
        for (int index=1; index<sales.length; index++)
        {
            if (sales[index]<lowest)
                lowest = sales[index];
        }
        return lowest;
    }
}
