/**
 * This program will create a method called examGrade that will take a grade and then give the level grade of that grade
 * @author David Toma
 */
public class Main {

// created a method 
public static int examGrade(int grade){
  // created if statements to determine what percentage is which letter grade
  if(grade >= 80){
    System.out.println("A");
  } else if(grade >= 70 && grade <= 79){
    System.out.println("B");
  } else if(grade >= 60 && grade <= 69){
    System.out.println("C");
  } else if(grade >= 50 && grade <= 59){
    System.out.println("D");
  } else if(grade < 50){
    System.out.println("F");
  }
  // return the grade to the user
  return grade;
}


  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // input the grade percent to input to the console
    examGrade(77);
    
  }
}
