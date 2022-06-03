package Spotkanie2;

public class FamilyTest {
    public static void main(String[] args) {
        FamilyMember dad = new FamilyMember();
        System.out.println("Nazwiśko rodu, to: " + dad.surName);
        System.out.println("Nazwiśko rodu, to: " + FamilyMember.surName);

        dad.name = "Tomasz";
        dad.age = 30;
        System.out.println(dad.name + " " + dad.age);

        FamilyMember son = new FamilyMember();
        son.name = "Karol";
        son.age = 7;
        System.out.println(son.surName + " " + son.name + " " + son.age);
        dad.surName = "Kowalśki";
        System.out.println(son.surName + " " + son.name + " " + son.age);


    }
}
