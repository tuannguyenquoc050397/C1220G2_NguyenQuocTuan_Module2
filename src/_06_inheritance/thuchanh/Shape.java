package _06_inheritance.thuchanh;

public class Shape {
    private String color;
    private Boolean isFilled;

    public Shape() {
        this.color="green";
        this.isFilled=true;
    }

    public Shape(String color, Boolean filled) {
        this.color = color;
        this.isFilled = filled;
    }

    public Boolean isFilled() {
        return isFilled;
    }

    public void setFilled(Boolean filled) {
        this.isFilled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    @Override
    public String toString() {
        return "A Shape with color of "
                + getColor()
                + " and "
                + (isFilled() ? "filled" : "not filled");
}
public String news(){
        return "test";
    }
}


