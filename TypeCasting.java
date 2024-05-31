class Animal {
    void makeSound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Woof");
    }

    void fetch() {
        System.out.println("Dog fetches the ball");
    }
}

public class TypeCasting {
    public static void main(String[] args) {
        
        Animal animal = new Dog();  // upcasting
                animal.makeSound();
        
                Dog dog = (Dog) animal;  // downcasting
                dog.fetch();
            

// Widening Casting
        // int myInt = 9;
        // double myDouble = myInt; // Automatic casting: int to double

        // System.out.println(myInt);      // Outputs 9
        // System.out.println(myDouble);   // Outputs 9.0

        // int num = 100;
        // long longNum = num;  // implicit casting from int to long
        // float floatNum = longNum;  // implicit casting from long to float

        // System.out.println(longNum);      // Outputs 100
        // System.out.println(floatNum);   // Outputs 100.0


//Narrowing Casting

        double myDouble = 9.78d;
        int myInt = (int) myDouble; // Manual casting: double to int

        System.out.println(myDouble);   // Outputs 9.78
System.out.println(myInt);      // Outputs 9

        double doubleNum = 100.04;
        long longNum = (long) doubleNum;  // explicit casting from double to long
        int intNum = (int) longNum;  // explicit casting from long to int

        System.out.println(longNum);   // Outputs 100
        System.out.println(intNum);      // Outputs 100


// Real-Life Example

// Set the maximum possible score in the game to 500
int maxScore = 500;

// The actual score of the user
int userScore = 473;

/* Calculate the percantage of the user's score in relation to the maximum available score.
Convert userScore to float to make sure that the division is accurate */
float percentage = (float) userScore / maxScore * 100.0f;

// Print the result
System.out.println("maxScore is " + maxScore);
System.out.println("userScore is " + userScore);
System.out.println("User's percentage is " + percentage);   

        

            
            
    }
}







