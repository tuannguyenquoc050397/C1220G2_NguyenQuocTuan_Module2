package _07_abstactClass_interface.thuchanh.lop_animal_interface_edible;

public class Tiger extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Tiger rrrrrrrr";
    }

    @Override
    public String howToEat() {
        return "Tiger eattttttttttttt";
    }
}
