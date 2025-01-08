public class Car
{
  private String Make;
  private String Model;
  private int Year;
  private double MPG;
  private static int CarID = 0;
  private int ID;

  public Car(){
    CarID++;
    ID = CarID;
    Model = "None";
    Year = 2000;
    MPG = 0;

  }

  public Car(String make, String model, int year, double mpg){

    Make = make;
    Model = model;
    if (year < 1885){
        Year = 2000;
    }
    else if (year > 2022){
        Year = 2022;
    }
    else{
        Year = year;
    }
    if (mpg < 0){
        MPG = 0;
    }
    else {
        MPG = mpg;
    }
  }

  public String toString(){
    return ("ID: " + this.ID + "\nMake: " + this.Make + "\nModel: " + this.Model + "\nYear: " + this.Year + "\nMPG: " + this.MPG);
  }

}
