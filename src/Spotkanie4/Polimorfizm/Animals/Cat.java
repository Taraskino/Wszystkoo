package Spotkanie4.Polimorfizm.Animals;

public class Cat extends Animal{
    public Cat(String name) {
        this.name = name;
    }
    @Override
    String showName() {
        return "kot " + name;
    }
    @Override
    String makeSound() {
        return "miau - miau";
    }
}


