import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    String input = "";
    String input2 = "";
    int intput;
    double doubleput;
    while (!input.equals("q"))
    {
      System.out.println("Input the make of the car, \"default\" to create a default car or \"q\" to quit:");
      input = sc.nextLine();

      if (input.equals("default"))
      {
        // create default car
        Car defaultCar = new Car();
        System.out.println("");
        System.out.println(defaultCar.toString());
      }
      else if (input.equals("q")){

      }
      else
      {
        // ask for model, year, miles per gallon
        System.out.println("model?");
        input2 = sc.nextLine();
        sc.nextLine();
        System.out.println("year?");
        intput = sc.nextInt();
        System.out.println("miles per gallon?");
        doubleput = sc.nextDouble();
        Car objCar = new Car(input, input2, intput, doubleput);
        System.out.println("");
        System.out.println(objCar.toString());
        sc.nextLine();
      }
    }
    sc.close();
  }
}
