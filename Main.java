public class Main {

    public static void main(String[] args) {

        //Create an animal object
        Animal animal = new Animal("Bird", 3, "yellow");
        //Create a cat object
        Cat cat = new Cat(4, "gray");
        //Create a dog object
        Dog dog = new Dog(7, "brown");
        
        //Change object attributes
        animal.color = "blue";
        cat.age = 5;
        dog.age = 8;

        //Use object behaviors
        cat.changeAge(2);
        dog.changeAge(1);
        animal.changeAge(3);

        cat.makeSound();
        dog.makeSound();
        animal.makeSound();

        cat.printAttributes();
        dog.printAttributes();
        animal.printAttributes();
    }
}
