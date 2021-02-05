package _05_accessModifier_staticMethod_staticPropeties.baitap;

public class Circle {
        private double radius=1;
        private String color="Blue";
        public Circle(double radius) {
            this.radius = radius;
        }
        public Circle() {

        }
        double getRadius(){
            return this.radius;
        }
        public double getArea(){
            return Math.PI*this.radius*this.radius;
        }


}
