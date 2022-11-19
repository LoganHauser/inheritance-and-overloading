//Cat class created by Logan Hauser
//For Software and Programming Dev class
public class Cat extends Animal {

    public Cat(int age, String color) {
        super("Cat", age, color);
    }

    //Override the makeSound() method in the Animal class
    @Override
    public void makeSound() {
        System.out.println("Cat meowed");
    }
    
    //Override the printAttributes() method in the Animal class
    @Override
    public void printAttributes() {
        System.out.println("Cat's attributes:");
        System.out.println("\tAge: " + this.age);
        System.out.println("\tColor: " + this.color);
        System.out.println();
    }
}
