package _07_abstactClass_interface.baitap.resizeable;

import _06_inheritance.thuchanh.Shape;

public class Test {
    public static void main(String[] args) {
        Shape[] listShape = new Shape[3];
        listShape[0] = new Circle();
        listShape[1] = new Rectangle();
        listShape[2] = new Square();
        ((Circle) listShape[0]).resize(Math.random() * 100);
        ((Rectangle) listShape[1]).resize(Math.random() * 100);
        ((Square) listShape[2]).resize(Math.random() * 100);
    }
}
