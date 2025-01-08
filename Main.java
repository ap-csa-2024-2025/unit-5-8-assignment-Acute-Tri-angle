import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    String input = "";
    while (!input.equals("q"))
    {
      System.out.println("Input the make of the car, \"default\" to create a default car or \"q\" to quit:");
      input = sc.nextLine();
      if (input.equals("default"))
      {
        // create default car
        Car objCar = new Car();
      }
      else
      {
        // ask for model, year, miles per gallon
        System.out.println();
      }

      System.out.println(objCar.toString()); // print out the car object
    }
  }
}
