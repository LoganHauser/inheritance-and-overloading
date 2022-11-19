//Animal class created by Logan Hauser
//For Software and Programming Dev class
public class Animal {

    //Create 3 attributes
    String animal;
    int age;
    String color;
    
    //Constructor
    public Animal(String animal, int age, String color) {
        //Set attributes to values given to the constructor
        this.animal = animal;
        this.age = age;
        this.color = color;
    }

    //Behavior that changes an attribute
    public void changeAge(int years) {
        this.age += years; //Change age by the given amount of years
    }
    
    public void makeSound() {
        System.out.println("Animal made a sound");
    }

    //Behavior that prints all attributes
    public void printAttributes() {
        System.out.println("Animal's attributes:");
        System.out.println("\tType: " + this.animal);
        System.out.println("\tAge: " + this.age);
        System.out.println("\tColor: " + this.color);
        System.out.println();
    }
}
