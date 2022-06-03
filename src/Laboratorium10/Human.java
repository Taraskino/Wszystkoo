package Laboratorium10;

public class Human {
    void eat(){
        System.out.println("Human is eat");
    }

    public static void main(String[] args) {
        Boy boy = new Boy();
        boy.eat();

        Human human = new Human();
        human.eat();
    }
}
