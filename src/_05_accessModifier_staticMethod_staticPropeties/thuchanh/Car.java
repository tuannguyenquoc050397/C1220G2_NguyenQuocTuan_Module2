package _05_accessModifier_staticMethod_staticPropeties.thuchanh;

public class Car {
    private String name;
    private String engine;
    public static int numOfCars=0;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public Car(String name, String engine) {
        this.name = name;
        this.engine = engine;
        numOfCars++;
    }

}
