public class alive {
    public static  void main(String[] args) {
        String fName="John (Xilin) ";
        String lName="Zhou";
        System.out.println(fName+ lName);
        int birthday=2003;
        int asOfDate=2022;
        System.out.println("I am " +(asOfDate-birthday) +" years old");
        System.out.println("I am " +((asOfDate-birthday)*12) +" months old");
        System.out.println("I am " +((asOfDate-birthday)*12*365*24) +" hours old");
        System.out.println("I am " +((asOfDate-birthday)*12*365*24*60) +" minutes old");
        float weekDaySleepAmountPerDay=6;
        float weekEndSleepAmountPerDay=7;
        System.out.println("The average amount of sleep I get is " +((weekEndSleepAmountPerDay+weekDaySleepAmountPerDay)/2) +" hours");
    }
}
