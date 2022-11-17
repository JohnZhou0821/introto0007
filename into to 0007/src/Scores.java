import java.util.*;
import java.io.*;

public class Scores {
    public static void main(String[] args) throws IOException {
        //ask user if they want to add scores
        Scanner scn = new Scanner(System.in);
        System.out.println("Do you want to enter students scores? Please enter yes or no");
        String enter = scn.next();
        while (!enter.equalsIgnoreCase("yes")&&!enter.equalsIgnoreCase("no")){
            System.out.println("Yes or No please");
            enter=scn.next();
        }
        if (enter.equalsIgnoreCase("YES")) {
            postscores();
        }
        //ask them to find average scores
        System.out.println("Do you want to find class average? Please yes or no");
        String enter2 = scn.next();
        while (!enter2.equalsIgnoreCase("yes")&&!enter2.equalsIgnoreCase("no")){
            System.out.println("Yes or No please");
            enter2=scn.next();
        }
        if (enter2.equalsIgnoreCase("YES")) {
            findaverage();
        }
        //ask them to find high
        System.out.println("Do you want to find class high? Please yes or no");
        String enter3 = scn.next();
        while (!enter3.equalsIgnoreCase("yes")&&!enter3.equalsIgnoreCase("no")){
            System.out.println("Yes or No please");
            enter3=scn.next();
        }
        if (enter3.equalsIgnoreCase("YES")) {
            findhigh();
        }
        //as them to find low
        System.out.println("Do you want to find class low? Please yes or no");
        String enter4 = scn.next();
        while (!enter4.equalsIgnoreCase("yes")&&!enter4.equalsIgnoreCase("no")){
            System.out.println("Yes or No please");
            enter4=scn.next();
        }
        if (enter4.equalsIgnoreCase("YES")) {
            findlow();
        }
    }
    
    public static void postscores() throws IOException{
        String yesno;
        Scanner scn=new Scanner(System.in);
        System.out.println("Please enter file name");
        String file_name=scn.next();

        FileWriter outputFile= new FileWriter(file_name);
        PrintWriter outFile=new PrintWriter(outputFile);

        do {
            System.out.println("please enter student's last name");
            String f_name =scn.next();

            outFile.println(f_name);

            System.out.println("please enter test score 1-100");
            double score= scn.nextInt();

            outFile.println(score);

            System.out.println("Add more scores? yes or no?");
            yesno=scn.next();
            while (!yesno.equalsIgnoreCase("yes")&&!yesno.equalsIgnoreCase("no")){
                System.out.println("Yes or No please");
                yesno=scn.next();
            }
        }

        while (yesno.equalsIgnoreCase("Yes")); {
            outFile.close();
            System.out.println("Data written");
        }
    }

    public static void findaverage() throws IOException{
     //read the scores from files and calc aver
     Scanner scn=new Scanner(System.in);
     System.out.println("Please enter the file name");
     String nameoffile=scn.nextLine();

     File file = new File(nameoffile);
     Scanner inputFile= new Scanner(file);
     int numofStudents =0;
     double totalscores =0;
     String name="";
     String yesno;

     while (inputFile.hasNext()){
         name =inputFile.next();
         double scores = inputFile.nextInt();
         numofStudents+=1;
         totalscores+= scores;
         System.out.println("The score for " +name+" is "+scores);

     }
     inputFile.close();
     System.out.println("");
     System.out.println("");
     System.out.println("The class average is "+totalscores/numofStudents);
     System.out.println("");
         System.out.println("Add more scores? yes or no?");
         yesno=scn.next();
         while (!yesno.equalsIgnoreCase("yes")&&!yesno.equalsIgnoreCase("no")){
            System.out.println("Yes or No please");
            yesno=scn.next();
        }
         if(yesno.equalsIgnoreCase("yes")){
            postscores();
         }
    }

    public static void findhigh() throws IOException{
         //read the scores from files and calc high
         Scanner scn=new Scanner(System.in);
         System.out.println("Please enter the file name");
         String nameoffile=scn.nextLine();
 
         File file = new File(nameoffile);
         Scanner inputFile= new Scanner(file);
         int numofStudents=0;
         double totalscores =0;
         String name="";
         double max=Integer.MIN_VALUE;
         String yesno;
 
         while (inputFile.hasNext()){
             name =inputFile.next();
             double scores = inputFile.nextInt();
             numofStudents+=1;
             totalscores+= scores;
             System.out.println("The score for " +name+" is "+scores);
             
             if(scores>max){
                max=scores;
             }
            }
         inputFile.close();
         System.out.println("");
         System.out.println("");
         System.out.println("The biggest number in the file is "+max);

         System.out.println("Add more? yes or no?");
         yesno=scn.next();
         while (!yesno.equalsIgnoreCase("yes")&&!yesno.equalsIgnoreCase("no")){
            System.out.println("Yes or No please");
            yesno=scn.next();
        }
         if(yesno.equalsIgnoreCase("yes")){
            postscores();
         }

     }
        
      

    public static void findlow() throws IOException{
        //read the scores from the files and calc low
        Scanner scn=new Scanner(System.in);
        System.out.println("Please enter the file name");
        String nameoffile=scn.nextLine();

        File file = new File(nameoffile);
        Scanner inputFile= new Scanner(file);
        int numofStudents =0;
        double totalscores =0;
        String name="";
        double min=Integer.MAX_VALUE;
        String yesno;

        while (inputFile.hasNext()){
            name =inputFile.next();
            double scores = inputFile.nextInt();
            numofStudents+=1;
            totalscores+= scores;
            System.out.println("The score for " +name+" is "+scores);
            if(scores<min){
               min=scores;
            }
        }
        inputFile.close();
        System.out.println("");
        System.out.println("");
        System.out.println("The biggest number in the file is "+min);
        
        System.out.println("Add more? yes or no?");
         yesno=scn.next();
         while (!yesno.equalsIgnoreCase("yes")&&!yesno.equalsIgnoreCase("no")){
            System.out.println("Yes or No please");
            yesno=scn.next();
        }
         if(yesno.equals("yes")){
            postscores();
         }

    }
    }

