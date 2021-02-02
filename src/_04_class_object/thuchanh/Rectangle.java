package _04_class_object.thuchanh;

public class Rectangle {
double width,height;
public Rectangle(){

}
public Rectangle(double height, double width){
    this.height=height;
    this.width=width;
}
public double getArea(){
    return this.width*this.height;
}
public double getPerimeter(){
    return (this.width+this.height)*2;
}
public String display(){
    return "Rectangle{" + "width=" + width + ", height=" + height + "}";
}

}
