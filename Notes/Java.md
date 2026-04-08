# Java

### Basic
1. In java, all code must be part of a `class`
2. Classes are difined with

    ```java
    public class CLASSNAME
    ```
3. Using `{}` to delineate the beginning and ending of things
4. End lines with a semicolon  `;` 
5. The code we want to run must be inside 

    ```java
    public static void main(String[] args)
    ```
6. **Java is `statically` typed** 
7. The compiler checks that all the types in your program are compatible **before the program ever runs**
8. Compilation and Interpretation
   
    ```text
    Hello.java 
        ↓ javac (compiler)
    Hello.class 
        ↓ java (interpreter)
    Program execution
    ```
9. Comments
    ```java
    /** The first line
     *  The second line
     */
    ```
###  Classes in Java

1. Constructors

    ```java
    public class Car{
        String model;
        int gas;

        public Car(String m, int n){
            this.model = m;
            this.gas = n;
        }
    }
    ```
2. Create new object

    ```java
    Car c1 = new Car("Toyato Supra", 98)
    ```
3. Seperate codes

    ```
    cs61b/
    └── lec/
        └── lec2/
            └── lec2_intro2/
                    ├── Dog.java
                    └── DogLauncher.java
    ```
    write this in the .java at the beginning

    ```java
    package lec2_intro2;
    ```
    run this in the terminal
    
    ```bash
    PS C:\...\cs61b\lec\lec2> javac lec2_intro2/*.java
    PS C:\...\cs61b\lec\lec2> java lec2_intro2.DogLuancher
    ```
4. Terminology

    ```java
    public class Dog {

        public int weightInPounds;                  /** Instance variable */

        public Dog(int startingWeight) {            /** Constructor */
            weightInPounds = startingWeight;
        }

        public void makeNoise() {                   /** Non-static method */
            if (weightInPounds < 10) {
                System.out.println("yipyip!");
            } else if (weightInPounds < 30) {
                System.out.println("bark!");
            } else {
                System.out.println("arooooooo!");
            }
        }
    }
    ```

    `Non-static method`, a.k.a `Instance method`. 
    
    (If the method is going to be invoked by an instance of the class, then it should be non-static)

    ```java
    public class DogLuancher {

        public static void main(String[] args) {
            Dog smallDog;               /** Declaration */
            new Dog(20);                /** Instantiation */
            smallDog = new Dog(5);      /** Instantiation and Assignment */
            smallDog.makeNoise();       /** Dot -> using a method */        
        }
    }
    ```
    `Declaration`, `Instantiation` and `Assignment` can be combined like this 

    ```java
    Dog hugeDog = new Dog(150);
    ```

### Static vs. Non-Static
- Static methods are invoked using the class name

    ```java
    Dog.makeNoise();
    ```
- Instance methods are invoked using an instance name

    ```java
    Dog maya = new Dog(100);
    maya.makeNoise();
    ```
