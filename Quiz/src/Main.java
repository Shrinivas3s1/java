<<<<<<< HEAD
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        QuestionService qs = new QuestionService();
        qs.displayQuestion();
    Scanner sc = new  Scanner(System.in);
        System.out.println("Do you want to see the score ? : Y/N");
        String choice = sc.nextLine();
        if(choice.equals("Y")){
            qs.calculateScore();
            System.out.println("Your score is : " + qs.returnScore());
        }

    }
}
=======
// CODE TO COMPARE SMALLEST AND LARGEST IN ARRAY

public class Main {
  public static void main(String[] args) {

    // TODO: Declare and initialize an integer array with the values 45, 22, 89, 16, 90, and 33
    int[] numbers = {45, 22, 89, 16, 90, 33};
    // TODO: Initialize min and max with the first element
    int small = 1000;
    int large = 0;
    // TODO: Use an enhanced for loop to find min and max

    for(int n: numbers){
      if(n > large){
        large = n;
      }
      if(n < small && n < large){
        small = n;
      }
    }
    System.out.println(small);
    System.out.println(large);

    // TODO: Print the smallest and largest numbers
  }
}
>>>>>>> 60d7949775fb2b07ce88a53b3c8ad32d078852ee
