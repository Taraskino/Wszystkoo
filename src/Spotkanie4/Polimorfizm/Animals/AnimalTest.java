package Spotkanie4.Polimorfizm.Animals;

public class AnimalTest {
    public static void main(String[] args) {
        Animal[] animals = new Animal[4];
        animals[0] = new Dog("Burek");
        animals[1] = new Cat("Filimon");
        animals[2] = new Pig("Prosiachek");
        animals[3] = new Animal();

        for(Animal animal : animals){
            animal.introduce();
        }
    }
}
