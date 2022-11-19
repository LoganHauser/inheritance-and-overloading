//Dog class created by Logan Hauser
//For Software and Programming Dev class
public class Dog extends Animal {

    public Dog(int age, String color) {
        super("Dog", age, color);
    }

    //Override the makeSound() method in the Animal class
    @Override
    public void makeSound() {
        System.out.println("Dog barked");
    }
    
    //Override the printAttributes() method in the Animal class
    @Override
    public void printAttributes() {
        System.out.println("Dog's attributes:");
        System.out.println("\tAge: " + this.age);
        System.out.println("\tColor: " + this.color);
        System.out.println();
    }
}
