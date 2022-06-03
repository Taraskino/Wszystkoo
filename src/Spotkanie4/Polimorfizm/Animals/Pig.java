package Spotkanie4.Polimorfizm.Animals;

public class Pig extends Animal{
    public Pig(String name) {
        this.name = name;
    }

    String showName(){
        return "świnka " + name;
    }
    String makeSound(){
        return "hrum - hrum";
    }
}
