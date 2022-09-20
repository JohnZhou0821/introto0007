public class alive {
    public static  void main(String[] args) {
        String fName="John (Xilin) ";
        String lName="Zhou";
        System.out.println(fName+ lName);
        double birthday=2003; //08/21/2003 10am
        double asOfDate=2022; //09/16/2003 10am
        System.out.println("I am " +(asOfDate-birthday) +" years old");
        System.out.println("I am " +((asOfDate-birthday)*12+1) +" months old");
        System.out.println("I am " +(((asOfDate-birthday)*12+1)*30.4167*24+(26*24)) +" hours old");
        System.out.println("I am " +(((asOfDate-birthday)*12+1)*30.4167*24*60+(26*24*60)) +" minutes old");
        float weekDaySleepAmountPerDay=6;
        float weekEndSleepAmountPerDay=7;
        System.out.println("The average amount of sleep I get is " +((weekEndSleepAmountPerDay+weekDaySleepAmountPerDay)/2) +" hours");
        }
    }
