
abstract class Dog {

    String breed;

    //Method - No forced implementation
    public void bark() {
        System.out.println("Bark!");
    }
    //Abstract methods - Classes extending Dog must implement these methods
    public abstract void eat();
    public abstract void run();

}


class PittBull extends Dog {
    @Override
    public void eat(){
        System.out.println("PittBull buries face in food.");
    }
    @Override
    public void run() {
        System.out.println("PittBull charges at you for a hug.");
    }
}

class Greyhound extends Dog {
    @Override
    public void eat(){
        System.out.println("Greyhound eats slowly.");
    }

    @Override
    public void run() {
        System.out.println("Greyhound sprints away.");
    }
}

class Beagle extends Dog {
    @Override
    public void eat(){
        System.out.println("Beagle chomps his food.");
    }

    @Override
    public void run() {
        System.out.println("Beagle wobbles walking away.");
    }
}




class Abstract{

    public static void main(String[] args) {
        System.out.println("\n");
        PittBull pittBull = new PittBull();
        pittBull.eat();
        pittBull.run();
        System.out.println("\n");


        Beagle beagle = new Beagle();
        beagle.bark();
        beagle.eat();
        beagle.run();
        System.out.println("\n");

        Greyhound greyhound = new Greyhound();
        greyhound.eat();
        greyhound.bark();
        greyhound.run();

//        Does not work, abstract class
//        Dog dog = new Dog;
//        dog.bark();

    }
}


