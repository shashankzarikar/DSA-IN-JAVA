public class Abstraction {
    public static void main(String args[]) {
        Horse h= new Horse ();
        h.walk();
       

}
     
}

abstract class Animal {
    void eat(){
        System.out.println("Eats Everything");
    }
    abstract void walk();
}

class Horse extends Animal {
    void walk() {
        System.out.println("Walks with 4 legs");

    }
    
}

class Chicken extends Animal {
    void walk() {
        System.out.println("Walks on 2  legs");
    }
}
