package _07_abstactClass_interface.thuchanh.lop_animal_interface_edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "chicken nnnnnnnnnnnn";
    }

    @Override
    public String howToEat() {
        return "Chicken eattttttttttt";
    }
}
