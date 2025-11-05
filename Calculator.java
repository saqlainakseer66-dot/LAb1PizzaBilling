import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Quiz marks:
        System.out.println("Enter Quiz marks: (0-15)");
        float quizMarks = input.nextFloat();
        while(quizMarks < 0 || quizMarks > 15){
            System.out.println("Invalid! Enter again Quiz Marks: ");
            quizMarks = input.nextFloat();
        }
        // Assignment marks:
        System.out.println("Enter Asssignment marks: (0-10)");
        float assMarks = input.nextFloat();
        while(assMarks < 0 || assMarks > 10){
            System.out.println("Invalid! Enter again Assignment Marks: ");
            assMarks = input.nextFloat();
        }
        // MidTerm marks:
        System.out.println("Enter Midterm marks: (0-25)");
        float midMarks = input.nextFloat();
        while(midMarks < 0 || midMarks > 25){
            System.out.println("Invalid! Enter again Mid Marks: ");
            midMarks = input.nextFloat();
        }
        // Final marks:
        System.out.println("Enter Final marks: (0-50)");
        float finalMarks = input.nextFloat();
        while(finalMarks < 0 || finalMarks > 50){
            System.out.println("Invalid! Enter Final Assignment Marks: ");
            finalMarks = input.nextFloat();
        }
        // Finding total and average:
        float total = quizMarks+assMarks+midMarks+finalMarks;
        float average = (total / 100) * 100;

        System.out.println("Quiz Marks: "+quizMarks);
        System.out.println("Assignment marks: "+assMarks);
        System.out.println("Midterm marks: "+midMarks);
        System.out.println("Final marks: "+finalMarks);
        System.out.println("Total marks: "+total);
        System.out.println("Average: "+average);
        // Grading
        if(average >= 85 && average <=100){
            System.out.println("Grade: A");
        }else if (average >= 70 && average < 85){
            System.out.println("Grade: B");
        }else if (average >= 50 && average < 70){
            System.out.println("Grade: C");
        }else{
            System.out.println("Fail");
  }

}
}
