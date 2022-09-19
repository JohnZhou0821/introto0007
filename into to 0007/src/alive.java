public class alive {
    public static  void main(String[] args) {
        int birthday=2003;
        int asOfDate=2022;
        System.out.println("I am " +(asOfDate-birthday) +" years old");
        System.out.println("I am " +((asOfDate-birthday)*12) +" months old");
        System.out.println("I am " +((asOfDate-birthday)*12*365*24) +" hours old");
        System.out.println("I am " +((asOfDate-birthday)*12*365*24*60) +" minutes old");
        int weekDaySleepAmountPerDay=6;
        int weekEndSleepAmountPerDay=7;
        System.out.println("The average amount of sleep I get is " +((weekEndSleepAmountPerDay+weekDaySleepAmountPerDay)/2) +" hours");
    }
}
