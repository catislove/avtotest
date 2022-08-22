package org.example;

import java.util.Scanner;
import static java.lang.Math.sqrt;

public class Homework4 {
    public static void main(String[] args) {
    }
    public static double calculateArea(double sideA, double sideB, double sideC) throws Exception {
        if (sideA <= 0 || sideB <= 0 || sideC <= 0) {
            throw new Exception("Длина стороны треугольника не может быть равна 0 или быть отрицательным числом");
        }
        double halfPerimeter = (sideA + sideB + sideC) / 2;
        return Math.sqrt(halfPerimeter * (halfPerimeter - sideA) * (halfPerimeter - sideB) * (halfPerimeter - sideC));
    }
}

/*
public class Homework4 {
    public Homework4 (double a, double b, double c) throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите длины сторон треугольника: ");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new Exception("Длина стороны треугольника не может быть равна 0 или быть отрицательным числом");
        }
        double halfPerimeter = (a + b + c) / 2;
        System.out.println(sqrt(halfPerimeter * (halfPerimeter - a) * (halfPerimeter - b) * (halfPerimeter - c)));
    }*/
