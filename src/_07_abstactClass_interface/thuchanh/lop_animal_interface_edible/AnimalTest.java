package _07_abstactClass_interface.thuchanh.lop_animal_interface_edible;


public class AnimalTest {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Chicken();
        animals[1] = new Tiger();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());
        }
        System.out.println(((Tiger) animals[1]).howToEat());
        System.out.println(((Chicken) animals[0]).howToEat());
    }
}
