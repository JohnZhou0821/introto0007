public class Sales {
    public static void main(String[] args) {
        final int ONE_WEEK = 7; // number of elements
        //create array to hold sales amounts for a week
        double[] sales = new double [ONE_WEEK];
        //get weeks sales figures
        getValues(sales);
        //create salesdata object, initialized with the weeks sales figures
        SalesData week= new SalesData(sales);
        System.out.println("The total sales were "+week.getTotal());
        System.out.println("The average sales were "+week.getAverage());
        System.out.println("The higehst sales were "+week.getHighest());
        System.out.println("The lowest sales were "+week.getLowest());
    }
    private static void getValues (double[] array)
    {
        String input; //To hold user input.
        //Get sales for each day of the week
        for (int i=0; i<array.length; i++)
        {
            System.out.println("Enter the sales for the day "+(i+1)+".");
            array[i]=Double.parseDouble(input); //i dont get why this is in he think because it dont work but ye
        }
    }
}
