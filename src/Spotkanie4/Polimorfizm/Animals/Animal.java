package Spotkanie4.Polimorfizm.Animals;

public class Animal {
    String name;

    public Animal(String name) {
        this.name = "bezimenny";
    }

    public Animal() {
        this.name = " bezimenny";
    }

    String showName(){
        return "zwierze" + name;
    }
    String makeSound(){
        return "????";
    }
    void introduce(){
        System.out.println("Jestem " + showName() + " " + makeSound());
    }
}
