[![Open in Codespaces](https://classroom.github.com/assets/launch-codespace-2972f46106e565e64193e422d61a12cf1da4916b45550586e14ef0a7c637dd04.svg)](https://classroom.github.com/open-in-codespaces?assignment_repo_id=17648950)
# unit-5-8-assignment

## Git Config
```
git config user.name "user"
git config user.email "email"
```

## Compiling and Running Java Programs
Note that since our classes are separate classes, you will need to compile ALL the files (at least one time).  You can do this by running
```
javac *.java
```
The star means to compile every file that is a Java file type.

Run your code by running
```
java Main.java
```

After you compile the shape classes, you only need to compile and run `Main.java` as usual.

# Instructions  

For this exercise, you will create a `Car` class to hold car data. You should create appropriate variables in your `Car` class to store the following information:

* Make - a string representing the make of the car
* Model - a string representing the model of the car
* Year - an integer representing the year the car was made
* MPG - a double representing the miles per gallon
* Car ID - an integer value which is automatically assigned (see below).

The car IDs are assigned in order: the first car has an ID of 1, the second car ID is 2, the next is 3, and so on. When a new Car object is created, your code should automatically initialize car id to the next integer value. For example, if the last created Car's car id is 17, the next car id generated should be 18.

Your student class should include the following public methods:

* `Car()` -  Constructs a new car with make and model set to "None", year set to 2000, and MPG set to 0. The car ID should automatically be set to the next integer.
* `Car(String make, String model, int year, double mpg)` -  Constructs a new car with variables initialized to the values specified. The year should not be greater than 2022 or less than 1885. If the year is greater than 2022, set the year to 2022. If the year is less than 1885, set the year to 2000. The miles per gallon should be greater than or equal to 0. If the miles per gallon is less than 0, set miles per gallon equal to 0. The car ID should automatically be set to the next integer.
* `String toString()` -  Returns the car information as a String in the following format:
```
ID: 1
Make: Toyota
Model: RAV4
Year: 2018
MPG: 32.5
```

Sample Run
```
Input the make of the car, "default" to create a default car or "q" to quit:
Toyota

Model of the car:
Rav4
Year of the car:
2017
Miles per gallon of the car:
32.5

ID: 1
Make: Toyota
Model: Rav4
Year: 2017
MPG: 32.5

Input the make of the car, "default" to create a default car or "q" to quit:
default

ID: 2
Make: None
Model: None
Year: 2000
MPG: 0.0
Input the make of the car, "default" to create a default car or "q" to quit:
default

ID: 3
Make: None
Model: None
Year: 2000
MPG: 0.0
Input the make of the car, "default" to create a default car or "q" to quit:
q

Exiting. Bye!
```
