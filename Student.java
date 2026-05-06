package Student_Grading_System;
import java.util.Scanner;
public class Student{

    static double sum(double[] m) {
        double sum = 0;
        for(int i=0; i<3; i++){
            sum = m[i]+sum;
        }
        return sum;
    }

    static double avg(double sum){
        return sum/3;
    }
    
    public static void main(String[] args){

        Scanner in=new Scanner(System.in);

        System.out.print("Enter Your Name: ");
        String name= in.nextLine();

        System.out.println("Enter Your Age: ");
        int age = in.nextInt();
        
        double marks[] = new double[3];
        System.out.println("Enter Your 3 Subject Marks: ");
        for(int i=0; i<3;i++){
            marks[i]=in.nextDouble();
        }

        double Total_marks = sum(marks);
        double Average =avg(Total_marks);
       

        System.out.println("----Student Information---- ");
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Total Marks: "+Total_marks);
        System.out.println("Average: "+Average);
        if(Average>=90){
            System.out.println("Grade: O");
        }else if(Average>=80){
            System.out.println("Grade: A");
        }else if(Average>=70){
            System.out.println("Grade: B");
        }else if(Average>=60){
            System.out.println("Grade: C");
        }else if(Average >=50){
            System.out.println("Grade: D");
        }else{
            System.out.println("Fail");
            System.out.println("--TRY AGAIN--");
        }

    }
}