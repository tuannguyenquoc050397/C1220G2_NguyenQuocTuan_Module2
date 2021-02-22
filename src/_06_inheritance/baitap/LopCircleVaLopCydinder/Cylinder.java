package _06_inheritance.baitap.LopCircleVaLopCydinder;

 class Cylinder extends Circle {
    private double height=5.0;

    public Cylinder() {
    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume(){
        return super.getArea()*this.height;
    }
    @Override
    public double getArea(){
        return super.getPerimeter()*this.height+super.getArea()*2;
    }
    @Override
    public String display(){
        return "A Cylinder with radius and height "+getRadius()+" and "+getHeight()+" and Area: "+this.getArea();
    }
}
